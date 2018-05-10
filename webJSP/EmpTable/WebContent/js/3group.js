	$(function () {
		var images = ["img/jinwonfront.png","img/jinwonback.png","img/jinwon1.jpg","img/jinwon2.jpg"]
	
		var i = 0
		setInterval(function() {
			if(i++ >= (images.length-1)){
				i = 0;
			}
			$('#img').attr("src", images[i]);
		}, 1000)
		
		allsearch()
		
		$('#allsearch').click(function() {
			allsearch()
		})
		
		$('#empnosearch').click(function() {
			findempno()
		})
		
		$('#empinsert').click(function(){
			var table = "<tr>"
			 	table +="<td><input type='text' id='insertempno' placeholder='사번'></td>"
				table +="<td><input type='text' id='insertename' placeholder='이름'></td>"
				table +="<td><input type='text' id='insertjob' placeholder='직업'></td>"
				table +="<td><input type='text' id='insertmgr' placeholder='사수번호'></td>"
				table +="<td><input type='text' id='inserthiredate' placeholder='입사일'></td>"
				table +="<td><input type='text' id='insertsal' placeholder='급여'></td>"
				table +="<td><input type='text' id='insertcomm' placeholder='수당'></td>"
				table +="<td><input type='text' id='insertdeptno' placeholder='부서번호'></td>"
				table +="<td><a id='insertconfirm'>확인</a>"
				table +="<td><a id='insertcancle'>취소</a>"
				table +="</tr>" 
			$('tbody').append(table)
			$('#insertempno').focus()
			
			$("#inserthiredate").datepicker({
				changeMonth: true,
				changeYear: true,
				minDate: new Date(1980, 1 - 1, 1)
			})
			
			$("#inserthiredate").datepicker( "option", "showAnim", "blind" )
			$("#inserthiredate").datepicker( "option", "dateFormat", "yy-mm-dd")
			
			$('#empinsert').hide()
		})
		
		$(document).on('click','#empdelete',function(){
			empdelete($(this).closest('tr')[0].firstChild.textContent)
		})

		$(document).on('click','#insertconfirm',function(){
			empinsert() 
		})
		$(document).on('click','#insertcancle',function(){
			$(this).closest('tr').remove()
			$('#empinsert').show()
		})

	})
	

	function allsearch(){
		$('tbody').empty()
		$.ajax({
			type : "POST",
			url : "Emplist",
			success : function(data) {
				console.log(data)
				$('#empinsert').show()
				var datas = JSON.parse(data)
	
				var table = ""
				$.each(datas, function(i, elt) {
					table += "<tr>"
					table += "<td>" +elt.empno +"</td>"
					table += "<td>" +elt.ename +"</td>"
					table += "<td>" +elt.job +"</td>"
					table += "<td>" +elt.mgr +"</td>"
					table += "<td>" +elt.hiredate +"</td>"
					table += "<td>" +elt.sal +"</td>"
					table += "<td>" +elt.comm +"</td>"
					table += "<td>" +elt.deptno +"</td>"
					table += "<td><a id='empdelete'>삭제</a></td>"
					table += "<td><a onclick='update(this)'>수정</a>"	
					table += "</tr>"
				})
				$('#myTable').append(table)
				$("#myTable").tablesorter(); 
			}
		}) 
	}
	 
	function findempno(){
		$('tbody').empty()
		$.ajax({
			type : "POST",
			url : "empFindByEmpnoServlet",
			data : {empno : $('#search').val()},
			success : function(data) {
				$('#search').val("")
				$('#empinsert').hide()
				if(data != ""){
					var emp = JSON.parse(data)
					var table = "<tr>"
						table += "<td>" +emp.empno +"</td>"
						table += "<td>" +emp.ename +"</td>"
						table += "<td>" +emp.job +"</td>"
						table += "<td>" +emp.mgr +"</td>"
						table += "<td>" +emp.hiredate +"</td>"
						table += "<td>" +emp.sal +"</td>"
						table += "<td>" +emp.comm +"</td>"
						table += "<td>" +emp.deptno +"</td>"
						table += "<td><a id='empdelete'>삭제</a></td>"
						table += "<td><a onclick='update(this)>수정</a>"	
						table += "</tr>"
					$('#myTable').append(table)
				}else{
					var table = "<tr><td colspan='10'> 검색된 사원이 없습니다 </td></tr>"
					$('#myTable').append(table)
				}
			}
		})
	}
	
	function empinsert(){
		$.ajax({
			type : "POST",
			url : "empInsertServlet",
			data : {
						empno : $('#insertempno').val(),
						ename : $('#insertename').val(),
						job : $('#insertjob').val(),
						mgr : $('#insertmgr').val(),
						hiredate : $('#inserthiredate').val(),
						sal : $('#insertsal').val(),
						comm : $('#insertcomm').val(),
						deptno : $('#insertdeptno').val()
					},
			success : function() {
				console.log("삽입 성공")
				allsearch()
				$('#empinsert').show()
			}
		})
	}
	
	function update(me){
		
		var tr = $(me).closest('tr')
		var datas = {empno:$(me).closest('tr').children().html()};
		$(me).closest('tr').empty();
		$('#empinsert').hide()
		
		$.ajax({
			url:"empFindByEmpnoServlet",
			data:datas,
			success : function(data) {
				var emp = JSON.parse(data)
				
				var td = "<td><input type='text' value='"+emp.empno +"' readonly></td>";
					td +="<td><input type='text' value='"+emp.ename +"'></td>";
					td +="<td><input type='text' value='"+emp.job +"'></td>";
					td +="<td><input type='text' value='"+emp.mgr +"'></td>";
					td +="<td><input type='text' value='"+emp.hiredate +"' readonly></td>";
					td +="<td><input type='text' value='"+emp.sal +"'></td>";
					td +="<td><input type='text' value='"+emp.deptno +"'></td>";
					td +="<td><input type='text' value='"+emp.deptno +"'></td>";
					td +="<td colspan='2'><a onclick='updateok(this)'>완료</a></td>";
					
					$(tr).append(td);
			}
		})
	}
	
	function updateok(me){
		var tr = $(me).closest('tr');
		var data = {empno:tr.find("td:eq(0)").children().val(),
					ename:tr.find("td:eq(1)").children().val(),
					job:tr.find("td:eq(2)").children().val(),
					mgr:tr.find("td:eq(3)").children().val(),
					hiredate:tr.find("td:eq(4)").children().val(),
					sal:tr.find("td:eq(5)").children().val(),
					comm:tr.find("td:eq(6)").children().val(),
					deptno:tr.find("td:eq(7)").children().val(),
				   };
		$.ajax({
			url:"empUpdateServlet",
			data:data,
			success : function() {
				console.log('수정 성공')
				$('#empinsert').show()
				allsearch()
			}
		})
	}
	
	function empdelete(delempno){
		console.log(delempno)
		$.ajax({
			type : "get",
			url : "empDeleteServlet",
			data : {empno : delempno},
			success : function() {
				console.log('삭제 성공')
				allsearch()
				$('#empinsert').show()
			}
		})
	}
	
	function out() {
		$('img').attr("src", "img/jinwonfront.png")
	}
	
	function over() {
		$('img').attr("src", "img/jinwonback.png")
	}
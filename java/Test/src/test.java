import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Member;
import java.util.Map;
import java.util.Scanner;
 
/**
 * 프로젝트 : 비트코인 캠프 시스템 파일이름 : userModify.java 날 짜 : 2018. 2. 23. 작성자명 : 김 명 수
 */
 
public class test {
    String path = null;
    Scanner sc = new Scanner(System.in);
    String before = null;
    String after = null;
    String id = null;
 
    public test() {
        System.out.println("수정할 id를 입력해 주세요");
        id = sc.nextLine();
 
        if (UserLists.getInstance().getStudentList().containsKey(id)) {
            path = "member/student/" + id;
            Map<String, Member> listname = UserLists.getInstance().getStudentList();
            listchange(listname);
            filechange(before, after);
 
        } else if (UserLists.getInstance().getTeacherList().containsKey(id)) {
            path = "member/teacher/" + id;
            Map<String,Member> listname = UserLists.getInstance().getTeacherList();
            listchange(listname);
            filechange(before, after);
 
        } else if (UserLists.getInstance().getStaffList().containsKey(id)) {
            path = "member/staff/" + id;
            Map<String, Member> listname = UserLists.getInstance().getStaffList();
            listchange(listname);
            filechange(before, after);
        } else {
            System.out.println(id + "라는 user가 없습니다.");
        }
 
    }
 
    /**
     * 
     * 날 짜 : 2018. 2. 23. 기 능 : 파일 안 단어 변경 작성자명 : 김 명 수
     */
    void filechange(String oldname, String newname) {
 
        File inputfile = new File(path);
        File outputfile = new File(path + ".temp");
        FileInputStream fileinputstream = null;
        BufferedReader bufferedreader = null;
        FileOutputStream fileoutputstream = null;
        BufferedWriter bufferedwriter = null;
        boolean result = false;
 
        try {
            fileinputstream = new FileInputStream(inputfile);
            fileoutputstream = new FileOutputStream(outputfile);
            bufferedreader = new BufferedReader(new InputStreamReader(fileinputstream));
            bufferedwriter = new BufferedWriter(new OutputStreamWriter(fileoutputstream));
 
            String line = "";
            String repline = "";
            String originalline = oldname;
            String replaceline = newname;
 
            while ((line = bufferedreader.readLine()) != null) {
                repline = line.replace(originalline, replaceline);
                bufferedwriter.write(repline, 0, repline.length());
                bufferedwriter.newLine();
 
            }
            result = true;
 
        } catch (IOException e) {
            e.printStackTrace();
 
        } finally {
            try {
                bufferedwriter.close();
                bufferedreader.close();
 
            } catch (Exception e) {
            }
 
            if (result) {
                inputfile.delete();
                outputfile.renameTo(new File(path));
            }
 
        }
 
    }
 
    /**
     * 
     * 날 짜 : 2018. 2. 23. 기 능 : list 수정 작성자명 : 김 명 수
     */
    void listchange(Map<String, Member> listname) {
 
        System.out.println("변경하고자 하는 정보를 선택하세요");
        System.out.println("1.비밀번호, 2.전화번호");
        int num = sc.nextInt();
 
        System.out.println("변경 내용을 작성해주세요");
        after = sc.next();
 
        if (num == 1) {
            before = listname.get(id).getPassword();
            listname.get(id).setPassword(after);
        } else if (num == 2) {
            before = listname.get(id).getPhoneNumber();
            listname.get(id).setPhoneNumber(after);
 
        } else {
            System.out.println("변경하고자 하는 정보의 번호를 잘못입력하셨습니다.");
            System.exit(0);
 
        }
 
    }
}
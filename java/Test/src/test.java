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
 * ������Ʈ : ��Ʈ���� ķ�� �ý��� �����̸� : userModify.java �� ¥ : 2018. 2. 23. �ۼ��ڸ� : �� �� ��
 */
 
public class test {
    String path = null;
    Scanner sc = new Scanner(System.in);
    String before = null;
    String after = null;
    String id = null;
 
    public test() {
        System.out.println("������ id�� �Է��� �ּ���");
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
            System.out.println(id + "��� user�� �����ϴ�.");
        }
 
    }
 
    /**
     * 
     * �� ¥ : 2018. 2. 23. �� �� : ���� �� �ܾ� ���� �ۼ��ڸ� : �� �� ��
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
     * �� ¥ : 2018. 2. 23. �� �� : list ���� �ۼ��ڸ� : �� �� ��
     */
    void listchange(Map<String, Member> listname) {
 
        System.out.println("�����ϰ��� �ϴ� ������ �����ϼ���");
        System.out.println("1.��й�ȣ, 2.��ȭ��ȣ");
        int num = sc.nextInt();
 
        System.out.println("���� ������ �ۼ����ּ���");
        after = sc.next();
 
        if (num == 1) {
            before = listname.get(id).getPassword();
            listname.get(id).setPassword(after);
        } else if (num == 2) {
            before = listname.get(id).getPhoneNumber();
            listname.get(id).setPhoneNumber(after);
 
        } else {
            System.out.println("�����ϰ��� �ϴ� ������ ��ȣ�� �߸��Է��ϼ̽��ϴ�.");
            System.exit(0);
 
        }
 
    }
}
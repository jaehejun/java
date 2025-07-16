package java0716;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@Data
@AllArgsConstructor
class Member {
    private String name;
    private String phoneNumber;
    private String address;

    @Override
    public String toString() {
        return name + " " + phoneNumber + " " + address;
    }
}
public class PhoneBookEx {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<Member>();
        File contact = new File("contact.txt");
        loadNumber(contact, members);

        while (true) {
            displayMenu();
            int select = scan.nextInt();
            switch (select) {
                case 1 -> addNumber(members);
                case 2 -> searchNumber(members);
                case 3 -> deleteNumber(members);
                case 4 -> displayList(members);
                case 5 -> saveNumber(members);
                case 6 -> System.exit(0);
            }
        }
    }
    public static void displayMenu() {
        System.out.println("===========================================================================");
        System.out.println("1.전화번호 추가 2.전화번호 조회 3.전화번호 삭제 4.전화번호 목록 5.파일 저장 6.프로그램 종료");
        System.out.println("===========================================================================");
        System.out.print("메뉴를 선택하세요 >> ");
    }
    public static void addNumber(ArrayList<Member> members) {
        Scanner scan = new Scanner(System.in);
        System.out.println("이름, 전화번호, 주소 순으로 입력하세요");
        String info = scan.nextLine();
        String[] infos = info.split(" ");
        members.add(new Member(infos[0], infos[1], infos[2]));
    }
    public static void searchNumber(ArrayList<Member> members) {
        Scanner scan = new Scanner(System.in);
        System.out.print("조회할 회원의 이름을 입력하세요 >> ");
        String name = scan.nextLine();
        for (Member member : members) {
            if (member.getName().equals(name)) {
                System.out.println(member);
                return;
            }
        }
        System.out.println("존재하지 않는 회원입니다");
    }
    public static void deleteNumber(ArrayList<Member> members) {
        Scanner scan = new Scanner(System.in);
        System.out.print("삭제 회원의 이름을 입력하세요 >> ");
        String name = scan.nextLine();
        for (Member member : members) {
            if (member.getName().equals(name)) {
                members.remove(member);
                System.out.println("해당멤버를 삭제하였습니다");
                return;
            }
        }
        System.out.println("존재하지 않는 회원입니다");
    }
    public static void displayList(ArrayList<Member> members) {
        System.out.println("목록에 저장된 회원 수는 " + members.size() + "명입니다");
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }
    public static void saveNumber(ArrayList<Member> members) throws IOException {
        FileWriter fw = new FileWriter("contact.txt");
        for (Member member : members) {
            fw.write(member.toString() + "\n");
        }
        fw.close();
    }
    public static void loadNumber(File file, ArrayList<Member> members) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String info;
        while ((info = br.readLine()) != null) {
            String[] infos = info.split(" ");
            members.add(new Member(infos[0], infos[1], infos[2]));
        }
        br.close();
    }
}

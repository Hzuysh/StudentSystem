import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

            mainSystem();
    }

    public static void Login(){
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作:");
        System.out.println("1.登陆");
        System.out.println("2.注册");
        System.out.println("3.忘记密码");
    }

    public static ArrayList<student> mainSystem() {
        ArrayList<student> list = new ArrayList<student>();
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("--------欢迎来到黑马学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.print("请输入您的选择");
            String input = sc.next();
            switch (input) {
                case "1" -> addStudent(list);
                case "2" -> delStudent(list);
                case "3" -> reStudent(list);
                case "4" -> searchStudent(list);
                case "5" -> {
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
//            if (input.equals("1")){
//                addStudent(list);
//            }else if (input.equals("2")){
//                delStudent(list);
//            } else if (input.equals("3")){
//                reStudent(list);
//            } else if (input.equals("4")){
//                searchStudent(list);
//            }else if (input.equals("5")){
//                break;
//            }else {
//                System.out.println("输入错误请重新输入");
//            }
        }
        return list;
    }
    public static void addStudent(ArrayList<student> list ){
        Scanner sc = new Scanner(System.in);
        student st = new student();

        String id = null;
        while (true) {
            System.out.println("请输入添加的学生ID");
            id = sc.next();
            boolean flag = contains(list,id);
            if (flag){
                System.out.println("重复ID,请重新输入ID");
            }else {
                st.setId(id);
                break;
        }
        }
        System.out.println("请输入添加的学生姓名");
        String name = sc.next();
        st.setName(name);

        System.out.println("请输入添加的学生年龄");
        int age = sc.nextInt();
        st.setAge(age);

        System.out.println("请输入添加的学生地址");
        String address = sc.next();
        st.setAddress(address);

        list.add(st);


    }
    public static void delStudent(ArrayList<student> list){
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入要删除的ID");
        student st = new student();
        String did = sc.next();
        int index = getIndex(list,did);

        if (index>=0){
            list.remove(index);
            System.out.println("ID为" + did + "删除成功");
        }else {
            System.out.println("ID不存在,即将返回初始菜单");
        }

    }
    public static void reStudent(ArrayList<student> list){
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入要修改的ID");

        String did = sc.next();
        int index = getIndex(list,did);

        if (index == -1){
            System.out.println("要修改的ID" + did + "不存在,请重新输入");
            return;
        }else {

            student st = list.get(index);
            System.out.println("请输入要修改的学生姓名");
            String newName = sc.next();
            st.setName(newName);

            System.out.println("请输入要修改的学生年龄");
            int newAge = sc.nextInt();
            st.setAge(newAge);

            System.out.println("请输入要修改的学生地址");
            String newAddress = sc.next();
            st.setAddress(newAddress);
        }

    }
    public static void searchStudent(ArrayList<student> list){
        if (list.isEmpty()){
            System.out.println("当前无学生信息,请添加后查询");
            return;
        }
        System.out.println("id\t\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            student Student = (list.get(i));
            System.out.println(Student.getId() + "\t"+ Student.getName() + "\t" + Student.getAge() + "\t" + Student.getAddress());
        }
    }

    public static boolean contains(ArrayList<student> list,String id){
//        for (int i = 0; i < list.size(); i++) {
//            student st = list.get(i);
//            String sid = st.getId();
//            if (sid.equals(id)){
//                return true;
//            }
//        }
//        return false;
        return  getIndex(list,id) >= 0;
    }

    public static int getIndex(ArrayList<student> list,String id) {

        for (int i = 0; i < list.size(); i++) {
            student st = list.get(i);
            String sid = st.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}

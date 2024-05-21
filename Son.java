class Father {

    String name;
    int roll_no;

    Father(String name, int roll_no) {
        this.name =  name;
        this.roll_no = roll_no;
    }
}

class Son extends Father {
    int ID;
     
    Son(String name, int roll_no, int ID) {
        super(name, roll_no);
        this.ID = ID;
    }

    public static void main(String[] args) {
        Son son = new Son("Rahul", 10, 2024);
        System.out.println(son.name + "\n" + son.roll_no + "\n" + son.ID);
    }
}

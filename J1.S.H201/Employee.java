class Employee {
    String code;
    String name;
    int age;

    public Employee() {
    }

    public Employee(String code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }   
}

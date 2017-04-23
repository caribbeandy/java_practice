class Person { 

    public void print() {
        System.out.println("I am a person!!");
    }

    public static void main(String [] args) {
        Person p = new Person();
        Student st = (Person)p;
    }

    static class Student extends Person {

        public void print() {
            System.out.println("I am a student!!");
        }
    }
}



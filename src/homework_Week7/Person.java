package homework_Week7;

public class Person {

    String firstname;
    String lastname;
    int age;

    public String getFirstName() {

        return firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public int getAge() {

        return age;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;

    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100) {
            age = 0;
        }
    }

        public boolean isTeen() {

            boolean a;

            if (age > 12 && age < 20) {
               a = true;
            } else {
                a = false;
            }

            return a;
        }


        public String getFullName () {

        if (firstname == null && lastname== null){

            return "";

        }else if (firstname != null && lastname==null){
            return firstname;
        }else if ( lastname != null && firstname == null){
            return lastname;
        }
        else {
            String fullname = firstname.concat(lastname);
            return fullname;
        }

        }



    }





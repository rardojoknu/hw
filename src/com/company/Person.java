package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    class Builder{
        private Builder(){}
        public Builder setFirstName(String firstName){
            Person.this.firstName=firstName;
            return this;
        }
        public Builder setLastName(String lastName){
            Person.this.lastName=lastName;
            return this;
        }
        public Builder setMiddleName(String middleName){
            Person.this.middleName=middleName;
            return this;
        }
        public Builder setCountry(String country){
            Person.this.country=country;
            return this;
        }
        public Builder setaddress(String address){
            Person.this.address=address;
            return this;
        }
        public Builder setAge(int age){
            Person.this.age=age;
            return this;
        }
        public Builder setGender(String gender){
            Person.this.gender=gender;
            return this;
        }

        public Person build(){
            return Person.this;
        }
    }

}

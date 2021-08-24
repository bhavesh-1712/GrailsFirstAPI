package demo.api

class Student {
    Long   id
    Long gr_no
    Long roll_no
    String first_name
    String middle_name
    String last_name
    Integer age 
    Long mobile_no
    String email

//    static constraints = {
//        division nullable: true
//        description nullable: true
//        population nullable: true
//        locations nullable: true
//    }

    static mapping = {
        version false
    }
}

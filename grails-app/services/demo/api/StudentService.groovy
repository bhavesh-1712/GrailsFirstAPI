package demo.api

import grails.gorm.transactions.Transactional

@Transactional
class StudentService {

    def list(def params, def request) {
        return Student.findAll()  
    }

    def single(def params, def request) {
        return Student.findById(params?.id)
    }

    def save(def params, def request) {
        def studentJson = request.JSON
        def studentInstance = new Student(studentJson)

        studentInstance = studentInstance.save()

        return studentInstance
    }

    def update(def params, def request) {
        def studentJson = request.JSON
        def studentInstance = Student.get(params?.id)
        studentInstance.properties = studentJson

        studentInstance = studentInstance.merge()

        return studentInstance
    }

    def delete(def params, def request) {
        def studentInstance = Student.get(params?.id)
        studentInstance = studentInstance.delete()

        return studentInstance
    }
}

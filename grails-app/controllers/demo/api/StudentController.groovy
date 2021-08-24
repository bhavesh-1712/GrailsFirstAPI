package demo.api


import grails.rest.*
import grails.converters.*

class StudentController extends RestfulController {
    def studentService
	static responseFormats = ['json', 'xml']

    StudentController() { 
        super(Student)
    }

    @Override
    def index() {
        respond studentService.list(params,request)
    }

    @Override
    def show() {
        respond studentService.single(params,request)
    }

    @Override
    def save() {
        def student = studentService.save(params,request)
        respond student
    }

    @Override
    def update() {
        def student = studentService.update(params,request)
        respond student
    }

    @Override
    def delete() {
        def student = studentService.delete(params,request)
        respond student
    }
}

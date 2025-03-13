from django.shortcuts import render,redirect
from .import models,forms


def home(request):
    if request.method =="POST":
        std_form = forms.Studentform(request.POST)
        if std_form.is_valid():
            std_form.save()
            student_form=forms.Studentform()
    else:
        student_form=forms.Studentform()

    student = models.Student.objects.all()
    student_form= forms.Studentform()
    context = {
        "students":student,
        "student_form":student_form
             }
    return render(request,"home.html",context)
    
def edit_student(request,id):

    student = models.Student.objects.get(
        id=id
        )
    if request.method =="POST":
        std_form = forms.Studentform(request.POST,instance=student)
        if std_form.is_valid():
            std_form.save()
            return redirect("home")
    else:
        student_form=forms.Studentform(instance=student)

    context={"student_form":student_form}
    return render(request,"edit.html",context)

def delete_student(request,id):
    student=models.Student.objects.get(id=id)
    if student:
        student.delete()
        return redirect("home")

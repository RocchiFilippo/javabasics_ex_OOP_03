package _3;

public class Student {
    private String studentName = null;
    private Integer studentAge = null;
    private Integer studentID = null;
    private Boolean studentScholarship = null;
    private String studentSituation = null;
    private int totalStudents = 0;

    //get and set creation
    public String getStudentName ()
    {
        totalStudents += 1;
        return  studentName;
    }
    public void setStudentName (String studentName)
    {
        this.studentName = studentName;
    }
    public Integer getStudentAge ()
    {
        return studentAge;
    }
    public void setStudentAge (Integer studentAge)
    {
        if (studentAge < 0)
        {
            this.studentAge = 0;
        }
        else
        {
            this.studentAge = studentAge;
        }
    }
    public Integer getStudentID ()
    {
        return  studentID;
    }
    public void setStudentID (Integer studentID)
    {
        if (studentID > 99999)
        {
            this.studentID = 99999;
        }
        else
        {
            this.studentID = studentID;
        }
    }
    public Boolean getStudentScholarship ()
    {
        return studentScholarship;
    }
    public void setStudentScholarship (Boolean studentScholarship)
    {
        if (studentScholarship.equals(true))
        {
            this.studentScholarship = studentScholarship;
        }
        else
        {
            this.studentScholarship = true;
            //we have only perfect students
        }
    }
    public String getStudentSituation ()
    {
        return studentSituation;
    }
    public void setStudentSituation (String studentSituation)
    {
        this.studentSituation = studentSituation;
    }
    public int getTotalStudents ()
    {
        return this.totalStudents;
    }

}

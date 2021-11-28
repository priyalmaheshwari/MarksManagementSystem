# MarksManagementSystem
This project maintains the students' marks of all subjects. Once the studentis authenticated then only he can see his/her marks.
Teachers have the authorization to update the marks , delete the entry of a particular student and create entry for new student.

---------------------DATABASE-------------------
On my local I named the database as "marksmanagement".

Three Tables are used
-Students (rollno, name, physics, chemistry, maths): for storing the details of student, like his rollno, name , physics marks, chemistry marks, maths marks.
// When teacher adds new students with corresponding marks then the entries get added to this table.

-Studentpassword (id, pass) : for storing the corresponding passwords of the students.
// In this table, when the students sign up, the entries will be added.

-Teacherpassword (id, pass) : for storing the corresponding passwords of the teachers.
// This table entries should be inserted beforehand of the starting of this project, as the teachers have to be already signed up. And we just get the option of signing in
for the teachers, not sign up.
Sample table below:

|1   | abc@abc |
|----|---------|
|2   | abc123  |


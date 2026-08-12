How to run:
open this project in Intelij Idea and then cick run.
after runing the program Open powershell and type this commands:

1.ADD STUDENT :
PS C:\Users\USERNAME> Invoke-RestMethod -Method POST -Uri "http://localhost:8080/addstudent?ID=100&name=ibrahim"

2.DELETE STUDENT :
PS C:\Users\USERNAME> Invoke-RestMethod -Method DELETE -Uri "http://localhost:8080/delet?i=1"

3.REPLACE STUDENT :
PS C:\Users\USERNAME> Invoke-RestMethod -Method PUT -Uri "http://localhost:8080/Replace?i=0&id=100&name=ibrahim"

4.REPLACE NAME ONLY:
PS C:\Users\USERNAME> Invoke-RestMethod -Method PATCH -Uri "http://localhost:8080/PATCH?i=1&name=IBRAHIM"

5.GET STUDENT BY INDEX NUMBER:
http://localhost:8080/students/0

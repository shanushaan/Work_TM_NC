# Work_TM_NC

Please find the details to run the project. 
<b>First task</b>
For the first task checkout the project or download it and import in Spring tool Suite Eclipse bundle (works with maven). 
the port is set to 31000 but change it in the runconfiguration if it is used. 

Run the project and go to localhost:port 
u will see some props defined. 

Now go to the localhost:port/subscribe?name=<YourString>
Currently in the code the limit of out is set to 31 chars so we can change code if we want to (Not great design, should have used config files)

<b>Second Task</b>
Go to the ShellTask folder in the files downloaded. 
Put them in a linux (I used RHEL) box. 
run the changeHTML.sh by giving inputfile, configfile and outputfile paths. 

if file is not executable use chmod to change permission. 

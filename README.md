# Yuno-Survey
Survey Application Automation

Yuno survey is a selenium based test automation platform for performing UI based functional checks. 

### Tech stack used in building the framework 
##### Programming language used: java 1.8
##### Unit Test framework : TestNG version 6.14.3
##### Automation API : Selenium version 3.141.59
##### Build tool: Maven
##### IDE : Eclipse Version: 2019-03 (4.11.0)

### Prerequisite 1
##### java should be installed on the system.To check if java is available on the system, go to command prompt and type java -version.It should display: 
    
"java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)".

### Prerequisite 2 (not mandatory)
##### git should be configured on the system to pull the project from github. 

If github is not configured on the system, then project can be downloaded using the option "Download ZIP" from https://github.com/rohitbahadur/Yuno


### Installation (using git, assumption is a repo created on github )
1. If using git,create a project folder on your local machine.
2. From the git repo click on Clone or download option and copy the link. 
2. Go to command prompt and navigate to the project and folder and type git clone "copy the link" (copy the link is the link copied from git repo).


### Installation (without git)
1. There is no additional settings or configurations required. The 
   project can be downloaded using git or option "Download ZIP" from 
   https://github.com/rohitbahadur/Yuno.
2. unzip (if downloaded as a ZIP) the project folder and open in eclipse 
    (File-->Open Projects from File System ). Select the directory where 
    the project folder is available.



#### Project Design Strategy
#### The project is designed using page object model principles.
1. pages package --> Page objects are stored in their respective page 
   under "pages" 
   package.
2. config package --> Project configurations (baseurl andd some inputs (page5reply and feeforrobot)) which are used to 
   navigate to respective url and also to make an input into the related fields in  
   application are maintained in this package ProjectConfig.properties 
   file.
3. setup package --> This package has DriverSetup class to initialize the 
   webdriver/s which is used to launch the browser/s(chrome,firefox).For 
   the current implementation Chrome is used as a default browser.
###### Note: I have eliminated the need to download the browser drivers locally. All th browser bindings is managed via maven.
    This has been achieved using WebDriverManager in the setup.
4. utils package --> Also, we have included a utils package which has a 
   class "WaitForPagesToLoad"--> designed to wait for specific time for the 
   elements to load in the application, "WaitingForSync" --> for Synchronization of pages (since this being an angular application)
   ,YunoAssertions--> for using asserts  and once can add more assertions without overloading the test class 
   and "CommonClickNextButon" --> This button is present in all the pages. These are extended as necessary.
5. test package --> This package contains a single test classe. 
   This is testng type which is included in testng.xml
   for execution and in turn will be executed using sure-fire plugin in pom.xml
6. All the dependency required for project execution are available under 
   pom.xml.


#### For executing the tests, expand daliatest and right click pom.xml and select Run As --> Maven test(ensure once downloaded / cloned as from git, let the needed dependencies be downloaded by maven. This may take some and the status can be viewed in bottom right corner "Building Workspace")


#### Configurations in pom.xml

Do mention the path of java compiler which is on your local system, into the following path  build --> plugins--> configurations--> executable tab 
 ```<build>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<fork>true</fork>
					<executable>C:\Program Files\Java\jdk1.8.0_201\bin\javac</executable>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M3</version>
				<configuration>
					<suiteXmlFiles>
						<suiteXmlFile>testng.xml</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>````


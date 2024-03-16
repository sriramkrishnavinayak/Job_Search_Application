**Job Search Application**

This project is a web application designed to connect students seeking jobs with companies offering opportunities. It streamlines the recruitment process for all parties involved.

**Benefits**

* **Efficiency:** Saves time and effort by simplifying the application process.
* **Matching Potential:** Helps students find suitable jobs and companies recruit qualified candidates. 

**Features**

* **Job Posting:** Companies can post job openings with required skills.
* **Job Search:** Students can browse available jobs and apply for relevant positions.
* **Secure Data Storage:** The system stores student and company details securely, with access restricted based on user roles. Students can only view company details for applied jobs, and companies can only access information of students who applied for their positions.

**Technologies Used**

* **Core Java:** Builds the application logic.
* **MySQL:** Stores all application data securely.
* **Hibernate:** Provides an ORM (Object-Relational Mapping) framework, simplifying data storage.
* **JUnit:** A testing framework to ensure functionalities work as expected.

**Modules**

The application is divided into four main modules:

1. **User Authentication:** Implements a secure login system with unique usernames and passwords for Admin, Students, and Companies.
2. **Admin Module:**
    * Login: Requires username and password for access.
    * Student Details:
        * View All Students:  Displays a list of all registered students.
        * Delete Student: Allows deleting student profiles.
        * View Updated Student List: Confirms successful student deletion.
    * Company Details:
        * View All Companies: Displays a list of all registered companies.
        * Add Company Detail: Allows adding a new company to the system.
        * Update Company Detail: Allows editing existing company information.
        * Search All Available Company Details: Displays all available jobs.
        * View All Posted Jobs: Displays a list of all jobs posted by all companies.
3. **Student Module:**
    * Login: Requires username and password for access.
    * Personal Info: Displays the student's details (name, contact, education, etc.).
    * View Posted Jobs: Lists all jobs posted by companies.
    * Apply for Job: Allows students to apply for jobs matching their skills and interests.
    * Update Student Details: Allows updating student information:
        * Education Details
        * Skills (add, remove, or edit)
        * Email and Contact Number
        * Experience
        * Resume (ensures students keep their profile updated)
4. **Company Module:**
    * Login: Requires username and password for access.
    * Company Info: Displays company details. Companies need to complete their profile before posting jobs.
    * Post a New Job: Allows companies to create new job postings with details like:
        * Job Title
        * Job Description
        * Location
        * Required Skills
    * View Applied Students: Allows viewing students who applied for specific jobs.
    * Update Company Details: Allows updating company information like:
        * Company Address
        * Email Details
    * Update Posted Job Details: Allows editing details of previously posted jobs (title, description, location, skills, posted date).

**Validations**

To ensure data accuracy, the application implements validations for user input:

* Email format
* Contact number (10 digits only)
* Resume upload (PDF format only)
* Job title (unique for each posting)

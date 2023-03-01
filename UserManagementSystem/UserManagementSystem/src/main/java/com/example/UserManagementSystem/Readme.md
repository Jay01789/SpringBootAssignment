---> Java language and SpringBoot Framework are used to create this project User Management System.
_______________________________________________________________________________________________________________________________________________________________________

---> Data Flow 
     * The required api is callled by the user from the broweser....
     * The request is received to the repective Controller in the project , The controller calls the respective method in the service layer.
     * The Method in the service layer will be having the required business logic tht execute the method and returns the result to controller which returns it to the                                                                                                                                                                     user.
     *In this project h2 data base is used .
     *Curd Repository is used in the repository layer.
     *The data will be stored in the h2 data base according to add / delete / update commands

_______________________________________________________________________________________________________________________________________________________________________
     
--->Project Summary

    * This is a User Management System system which stores the data of the user like userId , userName , emailId , phone NUmber , dob etc .......
    * Different end points are provided through which a user can
                                            * Add a new user to the dataBase
                                            * Update the excisting user .
                                            * Get the data of all user .
                                            * Get the data of user via user ID.
                                            * and can also delete the user vis ID from the dataBase.
     

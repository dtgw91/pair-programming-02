Background

**Part (i)**
- to create a validation module to check if the working days for a scheduled person is valid
    - working days is valid if total working days for the week is less than and equal to 4
- where applicable, validations need to be implemented
- you are free to alter the shape/definition of the model to what you feel is more efficient

Example: 

(+) if provided Monday to Thursday with 1 working day each, then the schedule provided is valid.

(-) if provided Monday to Friday with 1 working day each, then the schedule provided is invalid.

**Part(ii)**
- As there is a separate branch with a different system, there is an external module present where u need to take
into consideration the working days planned for that branch.
- The data contract for this external module is fixed, and based on the method found in ExternalModuleService, you are
not allowed to modify it
- With this new information, make enhancement to the code ensure the schedule planned is valid.  There is no change
in definition of valid.

**Part(iii) (if time permits or as discussion)**

How would you implement this for:
- Bulk validation for multiple employees

OR
- Include validation per month to hit at least 12 working days 

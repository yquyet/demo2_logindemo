Feature: Open Account


 Background:
 Given Open website http://localhost:8080/demo/

   Scenario Outline:  Open Account
       When I input username as <username> and password as <password>
       And I click submit
       Examples:
         | username     | password |
         | admin        | admin    |


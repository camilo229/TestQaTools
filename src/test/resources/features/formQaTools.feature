#Author: Juan Camilo


Feature: QaTools form

  As a QaTools user
  I want to complete the form:
  to send the information

  Scenario Outline: Complete the form to validate the submitted data
    Given the user is on the Qatools website
    When you complete the form with the data '<Name>', '<email>', '<currentAddres>', '<permanetAddres>'
    Then you can check the response to the website
    Examples:
      | Name                 | email            | currentAddres | permanetAddres |
      | Nombre por parametro | correo@Gmail.com | POsta Nv,12   | NYR, AV213     |
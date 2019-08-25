Feature: file.download
  Scenario: downloading documents
    Given user, not loged in, present on the website
    When user clicks on MATERIALS
    And clicks on Download files
    And selects given file
    And clicks on download icon
    Then the website will open download window
    And the file will be downloaded
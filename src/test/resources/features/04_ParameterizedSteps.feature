Feature: Google Arama Feature

  Background:
    Given Kullanici google sayfasindadir



    Scenario: cucumber search
      When Kullanici arama kutusuna "cucumber" yazip arattiginda
      Then Kullanici tittle da "cucumber" gormelidir




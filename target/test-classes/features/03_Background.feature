Feature: Google Arama Test Feature

  Background: Kullanici google sayfasinda her senaryoda google sitesinde olacaktir
    Given Kullanici google sayfasindadir


  Scenario: Kullanici samsung aradiginda samsung gormellidir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesinin gectigini dogrular



  Scenario: Kullanici samsung aradiginda samsung gormellidir
    When Kullanici cucumber kelimesini arar
    Then Kullanici sayfada cucumber kelimesinin gectigini dogrular



  Scenario: Kullanici samsung aradiginda samsung gormellidir
    When Kullanici selenium kelimesini arar
    Then Kullanici sayfada selenium kelimesinin gectigini dogrular
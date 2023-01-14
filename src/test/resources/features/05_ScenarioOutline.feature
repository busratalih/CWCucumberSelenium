Feature: Google Arama Feature




  Scenario Outline:
    Given Kullanici google sayfasindadir
    When Kullanici arama kutusuna "<aranacakKelime>" yazip arattiginda
    Then Kullanici tittle da "<dogrulanacakKelime>" gormelidir


    Examples:
    |aranacakKelime|dogrulanacakKelime|
    |samsung       |samsung           |
    |cucumber      |cucumber          |
    |selenium      |selenium          |



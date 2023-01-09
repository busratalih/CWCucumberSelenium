Feature: Google search test

  Scenario: Google da bir kelime arandıgında ilgili kelimeyi barındıran sonuclar goruntulenmelidir
    Given kullanıcı google sayfasındadır
    When kullanıcı samsung kelimesini arar
    Then kullanıcı sayfada samsung kelimesi gectigini dogrular
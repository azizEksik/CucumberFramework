
﻿# com.wonderworldcollage.T6
### 
***
### Genel Kurallarımız

* Locate'i alınan elementin, ait olduğu `@FindBy` notasyonunun üzerine yorum olarak nereye ait olduğunu yazıyoruz

&nbsp; &nbsp;   `orn:  //HomePage >>> LogoImage`

* Home Page, Admin, student, parent, teacher URL'leri aşağıdaki şekilde configuration.properties dosyasında yer alır

&nbsp; &nbsp;   `homePageUrl = https://qa.wonderworldcollege.com/`

&nbsp; &nbsp;   `adminLoginUrl = https://qa.wonderworldcollege.com/site/login`

&nbsp; &nbsp;   `parentLoginUrl = https://qa.wonderworldcollege.com/site/userlogin`

&nbsp; &nbsp;   `studentLoginUrl = https://qa.wonderworldcollege.com/site/userlogin`

&nbsp; &nbsp;   `teacherLoginUrl = https://qa.wonderworldcollege.com/site/login`

<br/>

***

### Isimlendirmelerde dikaat edilecekler

| Element Türü           | Variable name     |
|------------------------|-------------------|
| Button                 | xButton      |    
| Logo                   | logoX             |
| icon                   | iconX             |
| Sadece text            | labelX            |
| Drop down              | dropDownX         |
| Radio Button           | radioButtonX      |
| Email box              | xBox         |
| Tablo Sütünu           | columnX           |
| Tablo Satiri           | rowX              |
| Kisi Resimleri         | imageProfileX     |
| ürün resimleri         | imageProductX     |
| Destionation resimleri | imageDestinationX |
| Arka Plan resimleri | imageBackgroundX |
| Linkler                | linkX             |
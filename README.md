# 🚀 Ideasoft QA Assessment

Bu proje, **qatestcase.myideasoft.com** sitesi üzerinde verilen senaryoya uygun olarak gerçekleştirilen **test otomasyon çalışmalarını** içermektedir.  
Testler, **Selenium WebDriver** kullanılarak **Java** diliyle yazılmıştır ve kişisel olarak geliştirdiğim **custom test otomasyon frameworkü** kullanılmıştır 🧪⚙️

---

## 📝 Test Senaryosu

Aşağıdaki adımlar otomasyon kapsamında test edilmiştir:

1. 🌐 https://qatestcase.myideasoft.com/ sitesi ziyaret edilir.  
2. 🔍 Ana sayfadaki arama alanına **"ürün"** yazılarak arama yapılır.  
3. 📋 Arama sonucunda listelenen ürünün detay sayfasına gidilir.  
4. ➕ İlgili üründen **5 adet** sepete eklenir.  
5. ✅ **"SEPETİNİZE EKLENMİŞTİR"** yazısının ekranda göründüğü kontrol edilir.  
6. 🛒 **/sepet** sayfasına gidilir.  
7. 🔢 Sepet içeriğinde ilgili üründen **5 adet** olduğu doğrulanır.  

---

## 🖼️ Test Akışı Görselleri

### 🏠 Ana Sayfa – Arama
<img width="1894" height="1038" alt="Screenshot 2026-01-17 at 18 51 32" src="https://github.com/user-attachments/assets/cbb3b968-e0f1-47e7-8928-77bd885adcc7" />


### 📦 Ürün Detay Sayfası
<img width="1891" height="1026" alt="Screenshot 2026-01-17 at 18 56 26" src="https://github.com/user-attachments/assets/6a07b2c2-f472-45ad-a17e-e0a57a99179e" />


### ✅ Sepete Ekleme Mesajı
<img width="1857" height="960" alt="Screenshot 2026-01-17 at 18 55 22" src="https://github.com/user-attachments/assets/7474cc01-4f89-4350-bc2f-c00e2bb57ebe" />


### 🛒 Sepet Sayfası
![Sepet Sayfası](images/cart-page.png)

---

## 🛠️ Kullanılan Teknolojiler

- ☕ **Programlama Dili:** Java  
- 🤖 **Test Otomasyon Aracı:** Selenium WebDriver  
- 🧪 **Test Framework:** TestNG  
- 🌍 **Tarayıcı:** Google Chrome  
- 🏗️ **Otomasyon Framework:**  
  Kişisel olarak geliştirdiğim test otomasyon frameworkü bu projede kullandım.
  Framework ile ilgili detaylı bilgiye aşağıdaki link üzerinden ulaşabilirsiniz:  
  🔗 https://github.com/EmreUSL/selenium-automation-template

---

## 🎯 Testin Amacı

Bu çalışmanın amacı, temel bir e-ticaret senaryosu üzerinden aşağıdaki fonksiyonların otomasyon ile doğru şekilde test edilebildiğini göstermektir:

- 🔍 Arama fonksiyonunun doğrulanması  
- 📦 Ürün detay sayfasının kontrol edilmesi  
- ➕ Sepete ekleme işleminin test edilmesi  
- 🛒 Sepet içeriğinin doğrulanması  

---

## 📌 Notlar

- 📐 Testler **Page Object Model (POM)** prensibine uygun olarak yazılmıştır.  
- 🧹 Kod okunabilirliği ve sürdürülebilirlik ön planda tutulmuştur.  
- 🔄 Framework yapısı, yeniden kullanılabilir ve genişletilebilir olacak şekilde tasarlanmıştır.

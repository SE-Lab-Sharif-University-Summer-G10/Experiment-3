# SE-Lab Experiment 3
<div dir='rtl'>

## ایجاد آزمون‌رانه
۱.
اشکالاتی که در کد اولیه وجود داشت، به شرح زیر هستند:
- کتاب برگشته داده شده از کتابخانه کاربر پاک نمی‌شد اما به کتابخانه اصلی اضافه می‌شد. 
- دانشجویی که در کتابخانه ثبت نام نکرده بود می‌توانست از کتابخانه کتاب قرض بگیرد.

که در آزمون‌هایی که نوشته شد، این موارد بررسی شد.

در مرحله بعدی ما این موارد را برطرف کردیم و پس از آن آزمون‌ها را اجرا کردیم. آزمون‌ها با موفقیت اجرا شدند.

۲.
برای این بخش ابتدا آزمون‌ها را بر حسب مستندات داخل کد تولید کردیم، آن‌ها را اجرا کردیم و متوجه شدیم که به درستی اجرا نمی‌شوند (بجز آزمون null برگرداندن برای نوع اشتباه در جست‌وجو، که طبیعی است)

سپس موارد خواسته شده را پیاده سازی کردیم. در نهایت آزمون‌ها را اجرا کردیم و همگی به درستی اجرا شدند.


۲.
به طور خلاصه، تست‌های تیم توسعه بیشتر سطحی و در سطح کد هستند و به صورت خودکار انجام می‌شوند، اما تست‌های تیم QA نیازمندی‌های کاربران را بررسی می‌کنند و همچنین اطمینان حاصل می‌کنند که کل نرم افزار به درستی کار می‌کند.
 ### تست‌های تیم ایجاد:

- تست واحد (Unit Testing):

  - تست‌های واحد شامل آزمون عملکرد واحدهای مستقل و کوچک‌ترین بخش‌های کد (مانند توابع یا متدها) است.

  - این تست‌ها توسط توسعه‌دهندگان نوشته و اجرا می‌شوند تا اطمینان حاصل شود که هر واحد کد به درستی کار می‌کند.

- تست یکپارچه‌سازی (Integration Testing):

  - این تست‌ها برای بررسی عملکرد تعامل بین چندین بخش مختلف از سیستم، مانند ماژول‌ها یا سرویس‌ها، انجام می‌شود.
  - تیم توسعه‌دهنده از این تست‌ها برای اطمینان از اینکه بخش‌های مختلف کد به درستی با هم تعامل دارند استفاده می‌کنند.

- تست رگرسیون (Regression Testing):

- تست رگرسیون برای اطمینان از اینکه تغییرات جدید در کد باعث شکست یا بروز خطا در بخش‌های قبلی نرم‌افزار نمی‌شود، انجام می‌شود.
 - توسعه‌دهندگان از این تست‌ها برای جلوگیری از ورود باگ‌های جدید ناشی از تغییرات در کد استفاده می‌کنند.

### تیم تضمین کیفیت (QA Team)

- تست سیستم (System Testing):

  - تست سیستم شامل تست کل سیستم به عنوان یک واحد کامل است تا اطمینان حاصل شود که نرم‌افزار به طور کامل و بر اساس نیازمندی‌های کاربر کار می‌کند.
   - تیم QA این تست‌ها را انجام می‌دهد تا مطمئن شود تمامی اجزای نرم‌افزار به درستی با هم کار می‌کنند و نیازمندی‌ها برآورده شده‌اند.

- تست پذیرش (Acceptance Testing):

   - این تست‌ها برای بررسی نرم‌افزار از دیدگاه کاربر نهایی انجام می‌شود تا اطمینان حاصل شود که نرم‌افزار نیازمندی‌های کاربر را برآورده می‌کند.
   - تیم QA این تست‌ها را برای تضمین اینکه محصول نهایی قابل تحویل و مورد قبول کاربر است انجام می‌دهد.

- تست عملکرد (Performance Testing):

  - تست عملکرد برای بررسی کارایی نرم‌افزار در شرایط بار بالا، مانند تست بار (Load Testing) و تست استرس (Stress Testing) انجام می‌شود.
   - تیم QA از این تست‌ها برای اطمینان از اینکه نرم‌افزار تحت شرایط بار مختلف به خوبی عمل می‌کند استفاده می‌کند.

- تست امنیت (Security Testing):

  - تست امنیت برای شناسایی آسیب‌پذیری‌ها و نقص‌های امنیتی در نرم‌افزار انجام می‌شود.
  - تیم QA از این تست‌ها برای تضمین اینکه نرم‌افزار از لحاظ امنیتی مقاوم و ایمن است استفاده می‌کند.
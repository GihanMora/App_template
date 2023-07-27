# App Template
Cloning and set up
1. Changing app with new AppID and Name follow all the steps in https://www.youtube.com/watch?v=FPDr2STY4FA
   1.1 Open app in android studio goto project view, copy project folder, rename "newname" and save it in another location.
   1.2 Open it in android studio, open android view, app>java>first folder>right click refactor and rename package to "newname", tick search in comments and strings,text occurances. refactor.
   1.3 goto app>res>values>strings change appname
   1.4 goto Gradle Scripts>build.gradle(Module) change applicationId if not changed.
   1.5 goto Gradle Scripts>settings.gradle
   1.6 goto build and rebuild
   1.7 goto all java activities and import R package to remove error.
2. goto project view app google-services.json> change packagename in line 13 and 21

Customization
1. Change App name - project view>app>src>main> androidmanifest.xml change label in line 8 and 14
2. Change App icon - project view>app>src>main>res>drawable>change icccon.png
3. Change Whatsnext banner - project view>app>src>main>res>drawable>change ccvcc.png
4. Change main menu - project view>app>src>main>res>layout - homw.xml - change buttons and customize
5. Change side panel menu items - project view>app>src>main>res>menu> main_menu.xml
6. Change tab headers - project view>app>src>main>java>com.blogsopt.gihanmora.AppTemplate>MainActivity.java line 408 onwards change titles.
7. Change tab  - project view>app>src>main>res>layout> goto corresponding xml and customize
   1. there are 12 tabs abd 12 xmls mapped to each other.
8. removing a tab
   1. remove from tab pages
      1. project view>app>src>main>java>com.blogsopt.gihanmora.AppTemplate>MainActivity.java line 408 onwards remove titles.
      2. project view>app>src>main>java>com.blogsopt.gihanmora.AppTemplate>MainActivity.java line 404 get count change total tab count.
   2. remove from navigation menu
      1. - project view>app>src>main>res>menu> main_menu.xml
      - remove menu item
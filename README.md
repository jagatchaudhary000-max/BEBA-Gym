# BEBA – Android app

BEBA shows workout plans and a guide to 45 exercises. It works offline;
only the "Watch how-to videos" button needs internet.

There are two ways to get the APK. Pick one.

## Option A: GitHub (no software to install)

1. Sign in at https://github.com and create a new repository called `BEBA`.
   It can be private.
2. On the empty repository page, click **uploading an existing file**.
   Drag in **everything inside this folder**, including the hidden
   `.github` folder. Then click **Commit changes**.
   - If your computer hides the `.github` folder, create the file
     on GitHub instead: **Add file → Create new file**, name it
     `.github/workflows/build-apk.yml`, and paste in the contents of
     that file.
3. Open the **Actions** tab. The "Build BEBA APK" job starts
   by itself and takes about 3–5 minutes. If it doesn't start, click it, then
   **Run workflow**.
4. When it shows a green tick, open the run, scroll to **Artifacts**,
   and download **BEBA-apk**. Unzip it to get `BEBA.apk`.

## Option B: Android Studio

1. Install Android Studio from https://developer.android.com/studio
2. **File → Open**, then pick this folder. Wait for the "Gradle sync" to finish
   (the first time can take a few minutes).
3. **Build → Build App Bundle(s) / APK(s) → Build APK(s)**.
4. Click **locate** in the pop-up. The file is
   `app/build/outputs/apk/debug/app-debug.apk`.

## Installing on your phone

1. Send the APK to your phone (WhatsApp to yourself, Google Drive or a USB cable).
2. Tap it. Android will ask you to allow installs from that app.
   Tap **Settings → Allow from this source**, then go back and
   tap **Install**.
3. If Play Protect warns about an unknown app, tap **More details →
   Install anyway**. This happens with any app that isn't from the Play Store.

## Changing the app later

The whole app is one file: `app/src/main/assets/www/index.html`.
Edit it, then rebuild with either option.

- App name: `app/src/main/res/values/strings.xml`
- Icon: `app/src/main/res/drawable/ic_launcher_foreground.xml`
- Version: `versionCode` / `versionName` in `app/build.gradle.kts`
  (raise both before installing an update over an older version)

This builds a *debug* APK, which is fine for your own phone and for sharing
with friends. To publish on the Play Store, you need a signed release build
(**Build → Generate Signed App Bundle** in Android Studio) and a Google Play
developer account.

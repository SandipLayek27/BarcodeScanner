# BarcodeScanner
```sh
Using this library you can scan various types of barcode.
Like....
1D barcodes: EAN-13, EAN-8, UPC-A, UPC-E, Code-39, Code-93, Code-128, ITF, Codabar
2D barcodes: QR Code, Data Matrix, PDF-417, AZTEC
```
## Developed By
[![Sandip](https://avatars1.githubusercontent.com/u/31722942?v=4&u=18643bfaaba26114584d27693e9891db26bcb582&s=39) Sandip](https://github.com/SandipLayek27) 

# ★ Gradle Dependency
```sh
Add Gradle dependency in the build.gradle file of your application module (app in the most cases) : First Tab:
allprojects{
    repositories{
        jcenter()
        maven {
            url 'https://jitpack.io'
        }
    }
}
AND
dependencies {
    implementation 'com.github.SandipLayek27:BarcodeScanner:1.0'
}
```

## Android Code Setup
```sh
★ Static variable load
private static final int SCANNER_REQUEST_CODE = 0;

★ Call Barcode scanner activity
Intent intent = new Intent(this, ScannedBarcodeActivity.class);
startActivityForResult(intent, SCANNER_REQUEST_CODE);

★ Fetch Response
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == SCANNER_REQUEST_CODE) {
        if (resultCode == RESULT_OK) {
            String returnString = data.getStringExtra("dataset");
            // returnString is the scanned data
        }
    }
}
```
## Screens
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/f.jpg)
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/o.jpg)
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/t.jpg)
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/th.jpg)




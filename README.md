## BarcodeScanner
Using this library you can scan various types of barcode.
Like....
1D barcodes: EAN-13, EAN-8, UPC-A, UPC-E, Code-39, Code-93, Code-128, ITF, Codabar
2D barcodes: QR Code, Data Matrix, PDF-417, AZTEC

## Developed
[![Sandip](https://avatars1.githubusercontent.com/u/31722942?v=4&u=18643bfaaba26114584d27693e9891db26bcb582&s=39) Sandip](https://github.com/SandipLayek27) 

# Module Installation Process
★ Download Project.
★ Separate Module.
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/fi.jpg)
★ GOTO File > New > Import Module.
★ Select masterbarcodescaner.
★ Import Now.

## APP Gradle Setup
★ Goto app gradle
★ Write
dependencies {
  implementation project(path: ':masterbarcodescanner')
}
★ Sync your project

## Java Code Setup
★ Static variable load
private static final int SCANNER_REQUEST_CODE = 0;
★ Call activity
Intent intent = new Intent(this, ScannedBarcodeActivity.class);
startActivityForResult(intent, SCANNER_REQUEST_CODE);
★ Fetch Response
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == SCANNER_REQUEST_CODE) {
        if (resultCode == RESULT_OK) {
            String returnString = data.getStringExtra("dataset");
            tv_response.setText(returnString);
        }
    }
}
## Screens
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/f.jpg)
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/o.jpg)
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/t.jpg)
![alt text](https://raw.githubusercontent.com/SandipLayek27/BarcodeScanner/master/app/src/main/res/drawable/th.jpg)




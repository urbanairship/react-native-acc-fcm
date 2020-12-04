:warning: Note that all Accengage repos have moved to [Airship's github organisation](https://github.com/urbanairship). A redirection on the new links has been set. So, you can continue to use the Accengage links but we encourage you to modify your configuration to use the Airship link instead.
If you notice something wrong, do not hesitate to contact our customer support team.
This repo will be found at: https://github.com/urbanairship/accengage-react-native-acc-fcm

# react-native-react-native-acc-fcm

## Getting started

`$ npm install react-native-acc-fcm --save`

### Mostly automatic installation

`$ react-native link react-native-acc-fcm`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.accengage.react.plugin.RNAccFcmPackage;` to the imports at the top of the file
  - Add `new RNAccFcmPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-acc-fcm'
  	project(':react-native-acc-fcm').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-acc-fcm/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-acc-fcm')
  	```


## Usage
```javascript
import RNAccFcm from 'react-native-acc-fcm';
```
  

<!--docs:
title: "Example Article: iOS Button"
layout: detail
section: components
excerpt: "This is an example of the iOS Button developer article for material.io. It uses the template from [../article-component-template.md]"
iconId: 
path: /
api_doc_root: 
-->

# MDCButtons (Buttons)

`MDCButtons` is a customizable button component with updated visual styles. This button component has several built-in styles to support diffe/nt levels of emphasis, as typically any UI will contain a few different buttons to indicate different actions, and also supports [floating buttons](link to floating buttons here). 

## MDCButttons variants

1. [Text button](#text-button)
1. [Outlined button](#outlined-button)
1. [Contained button](#contained-button)
<img src="buttons-types-all.png" alt="Support button variants include text button in the upper left, outlined button in the upper right, contained button in the lower left, and toggle button in the lower right">



## Using `MDCButtons`

The `MDCButtons` component provides a complete implementation of Material Design’s button component.

Before using the `MDCButtons` component to implements its variants you must install. In your source files import the component, and then apply your theme:
 1. Install `MDCButtons`
     * Use CocoaPods to install `MDCButtons`
       1. Add the following to your `Podfile`:
         ```bash
        pod MaterialComponents/Buttons
         ```
       1. Run the installer:
         ```bash
         pod install
         ```
 1. Import `MDCButtons` and MDC buttons theming and initialize `MDCButtons` using `alloc`/`init`. Initialize your theme  before applying it to your button.

    **Note** For more information about themes, go to the [Theming page](https://material.io/develop/ios/components/theming/) for iOS.
       
       **Swift**
       ```swift
       import MaterialComponents.MaterialButtons
       import MaterialComponents.MaterialButtons_Theming
       ...
       let <local theme name> = <theme name>
       let button = MDCButton()
       ```
       **Objective-C**
       ```objc
       #import "MaterialButtons.h"
       #import <MaterialComponentsBeta/MaterialButtons+Theming.h>
       ...
       <theme name> *<local theme name> = [[<theme name> alloc] init];       
       MDCButton *button = [[MDCButton alloc] init];
       ```
1. Apply accessibility settings
  To help ensure your buttons are accessible to as many users as possible, please
  be sure to review the following recommendations:
    * Set an appropriate [`accessibilityLabel`](https://developer.apple.com/documentation/uikit/uiaccessibilityelement/1619577-accessibilitylabel) value if your button does not have a title or only have an icon.
        **Objective-C**
        ```objc
        button.accessibilityLabel = @"Create";
        ```
        **Swift**
        ```swift
        button.accessibilityLabel = "Create"
        ```

### Related APIs

#### MDCButton classes

* [Material Design guidelines: Buttons](https://material.io/go/design-buttons)
* [MDCRaisedButton](https://material.io/components/ios/catalog/buttons/api-docs/Classes.html#/c:objc(cs)MDCRaisedButton)
* [MDCButton](https://material.io/components/ios/catalog/buttons/api-docs/Classes/MDCButton.html)

#### MDCButton enumerations
* [Enumerations](material.io/components/ios/catalog/buttons/api-docs/Enums.html)



### Text button

The `TextButton` style has a transparent background with text in `colorPrimary`. Text buttons are used for low-priority actions, especially when presenting multiple options.

<img src="ios-text-button.gif" alt="animated gif of an iOS text button">

**Swift**
```swift
button.applyTextTheme(withScheme: <local theme name>)
```

**Objective-C**
```obj-c

MDCButton *button = [[MDCButton alloc] init];
[button applyTextThemeWithScheme:, <local theme name>];
```


#### Text button example using [MDCContainerScheme](https://github.com/material-components/material-components-ios/tree/stable/components/schemes/Container) theme

**Swift**

```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let containerScheme = MDCContainerScheme()
let button = MDCButton()
button.applyTextTheme(withScheme: containerScheme)
```

**Objective-C**

```ObjC
#import <MaterialComponents/MaterialButtons.h>
#import <MaterialComponents/MaterialButtons+Theming.h>

MDCContainerScheme *containerScheme = [[MDCContainerScheme alloc] init];
MDCButton *button = [[MDCButton alloc] init];
[button applyTextThemeWithScheme:containerScheme];
```

### Outlined button

The `OutlinedButton` style has a transparent background with text color in `colorPrimary`, and a small stroke around the button. Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

<img src="ios-outlined.gif" alt="animated gif of an iOS outlined button">

**Swift**
```swift
button.applyTextTheme(withScheme: containerScheme)
```
**Objective-C**
```objc
[self.button applyTextThemeWithScheme:self.containerScheme];
```

#### Outlined button example using [MDCContainerScheme](https://github.com/material-components/material-components-ios/tree/stable/components/schemes/Container) theme

**Swift**
```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let button = MDCButton()
button.applyTextTheme(withScheme: containerScheme)
```
**Objective-C**
```objc
#import <MaterialComponents/MaterialButtons.h>
#import <MaterialComponentsBeta/MaterialButtons+Theming.h>

MDCButton *button = [[MDCButton alloc] init];
[self.button applyTextThemeWithScheme:self.containerScheme];
```
### Contained button
The contained button is an elevated button with a background color in `colorPrimary` and text color in `colorOnPrimary`. This should be used for important, final actions that complete a flow, like ‘Save’ or ‘Confirm’. This style is the default and will be used if no style attribute is specified for a `MaterialButton`.


<img src="ios-contained.gif" alt="animated gif of an iOS contained button">

**Swift**
```swift
button.applyContainedTheme(withScheme: containerScheme)
```

**Objective-C**
```objc
[self.button applyContainedThemeWithScheme:self.containerScheme];
```

#### Contained button example using [MDCContainerScheme](https://github.com/material-components/material-components-ios/tree/stable/components/schemes/Container) theme

**Swift**
```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let button = MDCButton()
button.applyContainedTheme(withScheme: containerScheme)
```
**Objective-C**
```objc
#import <MaterialComponents/MaterialButtons.h>
#import <MaterialComponentsBeta/MaterialButtons+Theming.h>

MDCButton *button = [[MDCButton alloc] init];
[self.button applyContainedThemeWithScheme:self.containerScheme];
```

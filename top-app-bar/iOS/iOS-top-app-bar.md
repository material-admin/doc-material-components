<!--docs:
title: "Top app bars"
layout: detail
section: components
excerpt: "<Platform name> top app bar"
latest_update: "<date of last update>"
iconId:
path: /
api_doc_root:
-->

**Instructions to authors:**
* _Follow the instructions in each section &ndash; see the [accompanying examples](button-examples) for futher guidance._
* _Delete these instructions before submitting your document_

# Top app bars

[Top app bars](https://material.io/components/app-bars-top/#) display information and actions relating to the current screen.

There are two types of top app bar:

1. [Regular top app bar](#regular-top-app-bar)
1. [Contextual action bar](#contextual-top-app-bar)
<br>


1. ![Regular app bar: purple background, white text and icons](assets/regular_app_bar_example.png)
1. ![Contextual app bar: black background, white text and icons](assets/contextual_app_bar_example.png)

## Using the top app bar

The top app bar provides content and actions related to the current screen. It’s used for branding, screen titles, navigation, and actions.

A regular top app bar can transform into a contextual action bar.

### Install `AppBar`

<details>
<summary><b>Expand for installation instructions for <code>AppBar</code></b></summmary>
Before using the `AppBar` API to implement its types you must install `AppBar`. In your source files import the component, and then apply your theme:
1. Install `AppBar`
   * Use CocoaPods to install `AppBar`<!-- What are the correct packages? AppBar is listed as deprecated further along the original doc -->
     1. Add the following line to your `Podfile`:
       ```java
      pod MaterialComponents/AppBar
       ```
     1. Run the installer:
       ```bash
       pod install
       ```
1. Import `AppBar` and MDC app bar theming and initialize `Appbar` using `alloc`/`init`. Initialize your theme  before applying it to your app bar.

    **Note** For more information about themes, go to the [Theming page](https://material.io/develop/ios/components/theming/) for iOS.

<!--<div class="material-code-render" markdown="1">-->
     **Swift**
     ```swift
     import MaterialComponents.MaterialAppBar
     import MaterialComponents.MaterialAppBar_Theming
     /*...*/
     // Apply your app's Container Scheme to the App Bar controller
     let containerScheme = MDCContainerScheme()

     // Either Primary Theme
     appBarViewController.applyPrimaryTheme(withScheme: containerScheme)

     // Or Surface Theme
     appBarViewController.applySurfaceTheme(withScheme: containerScheme)
         ```
     **Objective-C**
     ```objc
     #import "MaterialButtons.h"
     #import <MaterialComponentsBeta/MaterialButtons+Theming.h>
     /*...*/
     // Apply your app's Container Scheme to the App Bar controller
     MDCContainerScheme *containerScheme = [[MDCContainerScheme alloc] init];

     // Either Primary Theme
     [self.appBarController applyPrimaryThemeWithScheme:containerScheme];

     // Or Surface Theme
     [self.appBarController applySurfaceThemeWithScheme:containerScheme];
       ```
<!--</div>-->

</details>


### Making the top app bar accessible

Because the app bar mirrors the state of your view controller’s `navigationItem`, making an app bar accessible often does not require any extra work.

The following examples demonstrate how to apply accessibility settings to your app bar"

<!--<div class="material-code-render" markdown="1">-->

**Swift**
```swift
self.navigationItem.rightBarButtonItem =
    UIBarButtonItem(title: "Right", style: .done, target: nil, action: nil)

print("accessibilityLabel: \(self.navigationItem.rightBarButtonItem.accessibilityLabel)")
// Prints out "accessibilityLabel: Right"
```

**Objective-C**
```objc
self.navigationItem.rightBarButtonItem =
   [[UIBarButtonItem alloc] initWithTitle:@"Right"
                                    style:UIBarButtonItemStyleDone
                                   target:nil
                                   action:nil];

NSLog(@"accessibilityLabel: %@",self.navigationItem.rightBarButtonItem.accessibilityLabel);
// Prints out "accessibilityLabel: Right"
```
<!--</div>-->

## Regular top app bar

The top app bar provides content and actions related to the current screen. It’s used for branding, screen titles, navigation, and actions.

### Regular top app bar example

\<platform API name\>
* [Class definition]()
* [GitHub source]()

The following example shows a top app bar with a page title, a navigation icon, two action icons, and an overflow menu:

![insert screenshot here]()

```
The source code for the regular top app bar should include the following:
* A purple container
* A navigation icon
* A title "Page title" in white
* Two action items:
    * favorite icon
    * search icon
* Overflow menu
* The top app bar should remain in place while the user scrolls

```

### Anatomy and Key properties

![Regular app bar anatomy diagram](assets/top_app_bar_anatomy.png)

1. Container
1. Navigation icon (optional)
1. Title (optional)
1. Action items (optional)
1. Overflow menu (optional)

<details>
<summary><b>Container </b> attributes</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

</details>

<details>
<summary><b>Navigation icon </b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

</details>


<details>
<summary><b>Title </b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** | | | | 
| **Typography** | | | |

</details>


<details>
<summary><b>Action item </b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |
</details>


<details>
<summary><b>Overflow menu </b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

</details>


#### Styles

_If the component API implements multiple types, include any style information that differentiates the types in a table_

## Contextual action bar

A top app bar can transform into a contextual action bar to provide contextual actions to selected items. For example, upon user selection of photos from a gallery, the top app bar transforms to a contextual app bar with actions related to the selected photos.

When a top app bar transforms into a contextual action bar, the following changes occur:

* The bar color changes
* Navigation icon is replaced with a close icon
* Top app bar title text converts to contextual action bar text
* Top app bar actions are replaced with contextual actions
* Upon closing, the contextual action bar transforms back into a top app bar.

### Contextual action bar example

\<platform API name\>
* [Class definition]()
* [GitHub source]()

The following example shows a contextual action bar with a contextual title, a close icon, two contextual action icons, and an overflow menu:

![insert screenshot here]()

```
The source code for the contextual action bar should switch from the regular app bar example to the 
contextual action bar and include the following:
* A black contextual container color
* A close button icon
* A contextual title that reads "Contextual title" in white
* Two action items:
    * download icon
    * garbage icon
* Overflow menu
* The top app bar should remain in place while the user scrolls

```

### Anatomy and Key properties

![Contextual action bar anatomy diagram](assets/contextual_action_bar_anatomy.png)

1. Close Button
1. Contextual title
1. Contextual action items (optional)
1. Overflow menu (optional)

<details>
<summary><b>Close button</b> attributes</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |


</details>

<details>
<summary><b>Contextual title</b> attributes</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** | | | | 
| **Typography** | | | |
</details>


<details>
<summary><b>Contextual action item</b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

</details>
<details>
<summary><b>Overflow menu</b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

</details>

#### Styles

_If the component API implements multiple types, include any style information that differentiates the types in a table_


## Theming a top app bar

The top app bar supports [Material Theming](https://material.io/components/app-bars-top/#theming) and can be customized in terms of color, typography and shape.

### Top app bar theming example

* Provide a screenshot of the regular app bar that uses the [Shrine](https://material.io/design/material-studies/shrine.html) theme with the following features:
    * title: "Page title" 
    * Two action items:
        * favorite icon
        * search icon
    * Overflow menu
    * The top app bar should remain in place while the user scrolls
* Provide a second screenshot of the contextual app bar that uses the [Shrine](https://material.io/design/material-studies/shrine.html) theme with the following features:
    * title: "Contextual title"
    * Two action items:
        * download icon
        * garbage icon
    * Overflow menu
    * The top app bar should remain in place while the user scrolls


<details><summary><b>Implementing top button bar theming</b></summary>

Provide example code that corresponds to the component type screenshot

</details>

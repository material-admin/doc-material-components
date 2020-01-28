<!--docs:
title: ttons"<component name>"
layout: detail
section: components
excerpt: "iOS Buttons"
ide_version: "<cIDE name> <compatible IDE version and build number>"
material_package_version: "<compatible Material platform package version number>"
iconId:
path: /
api_doc_root:
-->

# Buttons

[Buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.

There are four types of buttons:

1. [Text button](#text-button)
2. [Outlined button](#outlined-button)
3. [Contained button](#contained-button)
4. [Toggle button](#toggle-button) (*not fully supported in iOS*)

![Example of the four button types](assets/buttons_types.png)


## Using button

### Install `MDCButtons`

<details><summary>Expand for installation instructions for `MDCButtons`</summary>

Before using the `MDCButtons` API to implement its types you must install `MCDButtons`. In your source files import the component, and then apply your theme:
1. Install `MDCButtons`
   * Use CocoaPods to install `MDCButtons`
     1. Add the following line to your `Podfile`:
       ```java
      pod MaterialComponents/Buttons
       ```
     1. Run the installer:
       ```bash
       pod install
       ```
1. Import `MDCButtons` and MDC button theming and initialize `MDCButtons` using `alloc`/`init`. Initialize your theme  before applying it to your button.

    **Note** For more information about themes, go to the [Theming page](https://material.io/develop/ios/components/theming/) for iOS.

     **Swift**
     ```swift
     import MaterialComponents.MaterialButtons
     import MaterialComponents.MaterialButtons_Theming
     /*...*/
     let <local theme name> = <theme name>
     let button = MDCButton()
     ```
     **Objective-C**
     ```objc
     #import "MaterialButtons.h"
     #import <MaterialComponentsBeta/MaterialButtons+Theming.h>
     /*...*/
     <theme name> *<local theme name> = [[<theme name> alloc] init];
     MDCButton *button = [[MDCButton alloc] init];
     ```
</details>

### Making buttons accessible
 
To help make your buttons usable to as many users as possible, apply the following:

* Set an appropriate [`accessibilityLabel`](https://developer.apple.com/documentation/uikit/uiaccessibilityelement/1619577-accessibilitylabel) value if your button does not have a title or only has an icon:

    **Objective-C**
    ```objc
    button.accessibilityLabel = @"Create";
    ```
    **Swift**
    ```swift
    button.accessibilityLabel = "Create"
    ```
* Set the minimum [visual height to
36 and minium\um visual width to 64](https://material.io/design/components/buttons.html#specs)
    **Objective-C**

    ```objc
    button.minimumSize = CGSizeMake(64, 36);
    ```

    **Swift**

    ```swift
    button.minimumSize = CGSize(width: 64, height: 48)
    ```

* Set the[touch areas to at least 44 points high and 44
wide](https://material.io/design/layout/spacing-methods.html#touch-click-targets).
    To minimize a button's visual size while allowing for larger [touchable areas](https://material.io/design/layout/spacing-methods.html#touch-click-targets), set the `hitAreaInsets` to a negative value. Maintain sufficient distance between the button touch targets. For more see the [Touch and click
targets](https://material.io/design/layout/spacing-methods.html#touch-click-targets)
in the spec.

    **Objective C**
    ```objc
    CGFloat verticalInset = MIN(0, -(48 - CGRectGetHeight(button.bounds)) / 2);
    CGFloat horizontalInset = MIN(0, -(48 - CGRectGetWidth(button.bounds)) / 2);
    button.hitAreaInsets = UIEdgeInsetsMake(verticalInset, horizontalInset, verticalInset, horizontalInset);
    ```

    **Swift**
    ```swift
    let buttonVerticalInset =
    min(0, -(kMinimumAccessibleButtonSize.height - button.bounds.height) / 2);
    let buttonHorizontalInset =
    min(0, -(kMinimumAccessibleButtonSize.width - button.bounds.width) / 2);
    button.hitAreaInsets =
    UIEdgeInsetsMake(buttonVerticalInset, buttonHorizontalInset,
    buttonVerticalInset, buttonHorizontalInset);
    ```

    _**Note** There are [some](https://material.io/design/components/buttons.html#toggle-button) clear [exceptions](https://material.io/design/components/app-bars-bottom.html#specs) for these rules. Please adjust your buttons sizes accordingly._

* **Optional** Set an appropriate `accessibilityHint`

    Apple rarely recommends using the `accessibilityHint` because the label should
    already be clear enough to indicate what will happen. Before you consider
    setting an `-accessibilityHint` consider if you need it or if the rest of your
    UI could be adjusted to make it more contextually clear.

    A well-crafted, thoughtful user interface can remove the need for
   `accessibilityHint` in most situations. Examples for a selection dialog to
    choose one or more days of the week for a repeating calendar event:

    *   (Good) The dialog includes a header above the list of days reading, "Event
    repeats weekly on the following day(s)." The list items do not need
    `accessibilityHint` values.
    *   (Bad) The dialog has no header above the list of days. Each list item
    (representing a day of the week) has the `accessibilityHint` value, "Toggles
    this day."


\<**NOTE** Update table values and links to appropriate API documents\>
-----

## Text button

[Text buttons](https://material.io/components/buttons/#text-button) are typically used for less-pronounced actions, including those located in dialogs and cards. In cards, text buttons help maintain an emphasis on card content.


### Text button example

Source Code APIs:

* MDCButton
    * [Class description](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html)
    * [GitHub source](https://github.com/material-components/material-components-ios/blob/develop/components/Buttons/src/MDCButton.h)
* [Themes class description](https://material.io/develop/ios/components/theming/) <!-- This is slated to be deprected, though the examples from https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html appear to use this class -->

The following example shows a text button with a text label.

!["iOS Text button with purple text 'Text' over a white background."](assets/text-button.svg)

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
<details>
<summary><b>Adding an icon to a text button</b></summary>
<br>

The following example shows a text button with an icon.

!["iOS text button with purple text 'Text button' and '+' icon over a white background."](assets/text-button-icon.svg)

```swift

```


```objc

```

</details>

### Anatomy and key properties

A text button has a text label, a transparent container and an optional icon.

![Text button anatomy diagram](assets/text_button_anatomy.png)

1. Text label
1. Container
1. Icon

<details>
<summary><b>Text label</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** ||  | |
| **Color** |  |  | |
| **Typography** |  |  |  |

</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** |  |  | |
| **Stroke color** | |  | |
| **Stroke width** |  |  |  |
| **Shape** |  | | |
| **Elevation** | | | |
| **Ripple color** | | | | 
</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

</details>


## Outlined button

[Outlined buttons](https://material.io/components/buttons/#outlined-button) are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

### Outlined button example without container schemes

You can apply a theme to the button using `Themes`.

Source Code APIs:

* MDCButton
    * [Class description](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html)
    * [GitHub source](https://github.com/material-components/material-components-ios/blob/develop/components/Buttons/src/MDCButton.h)
* [Themes class description](https://material.io/develop/ios/components/theming/)  <!-- This is slated to be deprected, though the examples from https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html appear to use this class -->

The following example shows an outlined button with a text label and stroked container.    

!["Outlined button with purple text surrounded by a gray outline"](assets/outlined-button.svg)

**Swift**
```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let containerScheme = MDCContainerScheme()
let button = MDCButton()
button.applyOutlinedTheme(withScheme: containerScheme)
```
**Objective-C**
```objc

#import "MaterialButtons.h"
#import <MaterialComponentsBeta/MaterialButtons+Theming.h>

MDCContainerScheme *containerScheme = [[MDCContainerScheme alloc] init];
MDCButton *button = [[MDCButton alloc] init];

[self.button applyOutlinedThemeWithScheme:self.containerScheme];
```
### Outlined button example with container schemes

You can apply a theme to the button that applies to all elements in a container using `MDCContainerScheme`.

Source Code APIs:

* MDCButton
    * [Class description](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html)
    * [GitHub source](https://github.com/material-components/material-components-ios/blob/develop/components/Buttons/src/MDCButton.h)
* [Themes class description](https://material.io/develop/ios/components/theming/)  <!-- This is slated to be deprected, though the examples from https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html appear to use this class -->
* [MDCContainerScheme class description](https://github.com/material-components/material-components-ios/tree/stable/components/schemes/Container)

!["Outlined button example in Android with purple text surrounded by a gray outline"](assets/outlined-button.svg)

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
### Anatomy and key properties

An outline button has text, a container, and an optional icon.

![Outlined button anatomy diagram](assets/outlined_button_anatomy.png)

1. Text label
1. Container
1. Icon

<details>
<summary><b>Text label</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** |  | | |
| **Typography** | | | |


</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** || | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** || | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

</details>


## Contained button

[Contained buttons](https://material.io/components/buttons/#contained-button) are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

### Contained button example

Source Code APIs:

* MDCButton
    * [Class description](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html)
    * [GitHub source](https://github.com/material-components/material-components-ios/blob/develop/components/Buttons/src/MDCButton.h)
* [Themes class description](https://material.io/develop/ios/components/theming/)  <!-- This is slated to be deprected, though the examples from https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html appear to use this class -->

The following example shows a contained button with a text label and a filled container.

!["Contained button example with white text 'Text' on a purple background."](assets/contained-button.svg)

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


### Anatomy and key attributes

A contained button has text, a container, and an optional icon.


![Contained button anatomy diagram](assets/contained_button_anatomy.png)

1. Text label
1. Container
1. Icon

<details>
<summary><b>Text label</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** |  | | |
| **Typography** | | | |


</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** || | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** || | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

</details>



## Toggle button

[Toggle buttons](https://material.io/components/buttons/#toggle-button) can be used to select from a group of choices.

There are two types of toggle buttons:

* [Toggle button](#toggle-button) (*not supported in iOS*)
* [Icon](#icon)

### Toggle button

The toggle button allows you to select from a group of buttons that can be set to [selective action](https://material.io/components/buttons/#toggle-button) where only one button in a group can be selected at one time.

**NOTE** The Material toggle bar is not supported in iOS. 

### Icon

Icons can be used as toggle buttons when they allow selection, or deselection, of a single choice, such as marking an item as a favorite.


#### Icon example

Source code APIs:

* [MDCCardCollectionCell](https://material.io/develop/ios/components/cards/api-docs/Classes/MDCCardCollectionCell.html)
* [UICollectionViewController]()
* [Themes class description](https://material.io/develop/ios/components/theming/)  <!-- This is slated to be deprected, though the examples from https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html appear to use this class -->


The following example shows 4 images arranged in a 2-by-2 array with a favorite icon in the upper-right corner of each image.

<img src="assets/iOS-toggle-icon.png" alt="iOS toggle example showing 4 images in an array with a favorite icon in the upper-right corner of each image.">


It uses the class `ToggleButtonCell` &ndash; which extends the `MDCCardCollectionCell` &ndash; to display the image and the icon, and provide gesture recognition for each cell of the array.

```swift
import MaterialComponents.MaterialCards_Theming
import UIKit

class ToggleButtonCell: MDCCardCollectionCell {

  private lazy var imageView: UIImageView = {
    let imageView = UIImageView(frame: CGRect.zero)
    imageView.contentMode = .scaleAspectFill
    imageView.clipsToBounds = true
    imageView.translatesAutoresizingMaskIntoConstraints = false
    return imageView
  }()

  override init(frame: CGRect) {
    super.init(frame: frame)
    setCustomToggleButton()
  }

  required init?(coder aDecoder: NSCoder) {
    super.init(coder: aDecoder)
    setCustomToggleButton()
  }

  func setCardImage(named imageName: String) {

    let bundle = Bundle(for: ToggleButtonCell.self)
    imageView.image = UIImage(named: imageName, in: bundle, compatibleWith: nil)
    imageView.contentMode = .scaleAspectFill

    if imageView.superview == nil {
      contentView.addSubview(imageView)
      addConstrains()
    }
  }

  /// Customize the toggle button icon of the cell
  func setCustomToggleButton() {
    // Render the icon images as templates so they can be tinted.
    let bundle = Bundle(for: ToggleButtonCell.self)
    let selectedIcon = UIImage(named: "ic_favorite_24dp", in: bundle, compatibleWith: nil)?
      .withRenderingMode(.alwaysTemplate)
    let unselectedIcon = UIImage(named: "ic_favorite_border_24dp", in: bundle, compatibleWith: nil)?
      .withRenderingMode(.alwaysTemplate)

    // Set the toggle button image and tint color.
    setImage(selectedIcon, for: .selected)
    setImage(unselectedIcon, for: .normal)
  }

  func addConstrains() {
    if #available(iOS 11, *) {
      NSLayoutConstraint.activate([
        contentView.leftAnchor.constraint(equalTo: imageView.leftAnchor),
        contentView.rightAnchor.constraint(equalTo: imageView.rightAnchor),
        contentView.topAnchor.constraint(equalTo: imageView.topAnchor),
        contentView.bottomAnchor.constraint(equalTo: imageView.bottomAnchor)
      ])
    } else {
      preiOS11Constraints()
    }
  }

  func preiOS11Constraints() {
    imageView.addConstraints(
      NSLayoutConstraint.constraints(
        withVisualFormat: "H:|[view]|",
        options: [],
        metrics: nil,
        views: ["view": contentView]))
    imageView.addConstraints(
      NSLayoutConstraint.constraints(
        withVisualFormat: "V:|[view]|",
        options: [],
        metrics: nil,
        views: ["view": contentView]))
  }
}
```

The class `ToggleButtonCollectionViewController` &ndash; which extends `UICollectionViewController` &ndash; loads the images and icons in a list:

```swift
class ToggleButtonCollectionViewController: UICollectionViewController,
  UICollectionViewDelegateFlowLayout
{

  fileprivate let layout = UICollectionViewFlowLayout()
  @objc var containerScheme: MDCContainerScheming
  let padding: CGFloat = 8

  var dataSource = [
    (image: "toggle-button-image1", accessibilityLabel: "Teapot", selected: false),
    (image: "toggle-button-image4", accessibilityLabel: "Vases", selected: true),
    (image: "toggle-button-image3", accessibilityLabel: "Tape", selected: true),
    (image: "toggle-button-image2", accessibilityLabel: "Cup", selected: false),
    (image: "toggle-button-image1", accessibilityLabel: "Teapot", selected: false),
    (image: "toggle-button-image4", accessibilityLabel: "Vases", selected: false),
    (image: "toggle-button-image3", accessibilityLabel: "Tape", selected: false),
    (image: "toggle-button-image2", accessibilityLabel: "Cup", selected: false),
  ]

  init() {
    let layout = UICollectionViewFlowLayout()
    layout.minimumLineSpacing = padding
    layout.minimumInteritemSpacing = padding
    layout.sectionInset = UIEdgeInsets(top: padding, left: padding, bottom: padding, right: padding)

    containerScheme = MDCContainerScheme()

    super.init(collectionViewLayout: layout)
  }

  required init?(coder aDecoder: NSCoder) {
    fatalError("init(coder:) has not been implemented")
  }

  override func viewDidLoad() {
    super.viewDidLoad()

    collectionView.register(
      ToggleButtonCell.self, forCellWithReuseIdentifier: String(describing: ToggleButtonCell.self))
    collectionView.allowsMultipleSelection = true
    collectionView.backgroundColor = containerScheme.colorScheme.surfaceColor

    self.title = "Cards Toggle Button"
  }

  override func viewWillTransition(
    to size: CGSize, with coordinator: UIViewControllerTransitionCoordinator
  ) {
    super.viewWillTransition(to: size, with: coordinator)
    // Recalculate cell size when orientation changes
    collectionView.collectionViewLayout.invalidateLayout()
  }
}
```

The class `ToggleButtonCollectionViewController` can then be instantiated to display each image with an icon in an array:

```swift
// MARK: UICollectionViewDataSource

extension ToggleButtonCollectionViewController {

  override func numberOfSections(in collectionView: UICollectionView) -> Int {
    return 1
  }

  override func collectionView(
    _ collectionView: UICollectionView, numberOfItemsInSection section: Int
  ) -> Int {
    return dataSource.count
  }

  override func collectionView(
    _ collectionView: UICollectionView, cellForItemAt indexPath: IndexPath
  ) -> UICollectionViewCell {

    // Get our custom cell, which is a card cell subclass, with a custom toggle icon.
    let cell = collectionView.dequeueReusableCell(
      withReuseIdentifier: String(describing: ToggleButtonCell.self), for: indexPath)
    guard let cardCell = cell as? ToggleButtonCell else { return cell }

    // Get the card cell's data from the data source.
    let imagedata = dataSource[indexPath.item]

    // Set the card's image based on the datasource.
    cardCell.setCardImage(named: imagedata.image)

    // Apply the Material theme to the cards, which uses the primary color to theme the toggle
    // button color. In this example, we've overriden it with a white color.
    cardCell.applyTheme(withScheme: containerScheme)
    cardCell.setImageTintColor(.white, for: .normal) // Override the default toggle color.

    // Enable toggle button behavior in the card.
    cardCell.isSelectable = true

    // Select the card based on its state in the data source.
    cardCell.isSelected = imagedata.selected
    if imagedata.selected {
      collectionView.selectItem(at: indexPath, animated: true, scrollPosition: [])
    }

    // Ensure the card is accessible.
    cardCell.isAccessibilityElement = true
    cardCell.accessibilityLabel = imagedata.accessibilityLabel
    return cardCell
  }
}

// MARK: UICollectionViewDelegate

extension ToggleButtonCollectionViewController {

  override func collectionView(
    _ collectionView: UICollectionView, didSelectItemAt indexPath: IndexPath
  ) {
    dataSource[indexPath.item].selected = true
  }

  override func collectionView(
    _ collectionView: UICollectionView, didDeselectItemAt indexPath: IndexPath
  ) {
    dataSource[indexPath.item].selected = false
  }

  func collectionView(
    _ collectionView: UICollectionView,
    layout collectionViewLayout: UICollectionViewLayout,
    sizeForItemAt indexPath: IndexPath
  ) -> CGSize {
    let cardWidth = (collectionView.bounds.size.width - padding * 3) / 2
    return CGSize(width: cardWidth, height: cardWidth)
  }
}

// MARK: Catalog By convention

extension ToggleButtonCollectionViewController {

  @objc class func catalogMetadata() -> [String: Any] {
    return [
      "breadcrumbs": ["Cards", "Toggle Button in Cards"],
      "primaryDemo": false,
      "presentable": true,
    ]
  }
}
```

#### Anatomy and key properties

![Toggle button anatomy](assets/toggle_button_anatomy.png)

* A. Container
* C. Icon


Diagram label | Design Attribute |  Theme value |  Property
---|---|---|---
C | Icon | N/A | 
C | Icon color | Secondary color |  

.

<details>
<summary><b>Text label</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** |  | | |
| **Typography** | | | |


</details>

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** || | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

</details>

<details>
<summary><b>Icon</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** || | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

</details>



## Theming buttons

Buttons support [Material Theming](https://material.io/components/buttons/#theming) and can be customized in terms of color, typography and shape.

### Button theming example

API and source code:

* `MaterialButton`
    * [Class description](https://)
    * [GitHub source](https://github.com/material-components/)
    
The following example shows text, outlined and contained button types with Material Theming.

!["Button theming example for <platform> with three buttons - text, outlined and contained - with green/black color theming and cut corners."](assets/button-theming.svg)

<details>
<summary><b>Implementing button theming</b></summary>
<br>

[Shrine theme](https://material.io/design/material-studies/shrine.html)
```
Include source code implementing text, outlined, and contained buttons using "Shrine" theme.

Upload a screenshot of the render and update the image.
```

</details>

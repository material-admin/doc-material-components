<!--docs:
title: "Cards"
layout: detail
section: components
excerpt: "<platform> Cards"
ide_version: "<cIDE name> <compatible IDE version and build number>"
material_package_version: "<compatible Material platform package version number>"
iconId:
path: /
api_doc_root:
-->

_**Instructions**_
* [Using cards](#using-cards)
    * Add a link under [Using cards](#using-cards) to your getting started page if you have one
    * Insert [installation](#installation) and [theming](#theming) as appropriate for your platform
    * Insert any additional instructions that apply to your platform with a separte level 3 header
    * If you have no getting started links or instructions, delete the [Using cards](#using-cards) sections
* [Elevated](#elevated-card) ane [Outlined](#outlined-card) sections
    * Add links to your platform 



# Cards

[Cards](https://material.io/components/cards/) contain content and actions about a single subject.

![Elevated card wtih a secondary title and two actions: Action 1 and Action 2 in purple](assets/generic-card-type-elevated.png) 


## Using cards

### Install `MDCCards`

Before using the `MDCCards` API to implement its types, you must install `MDCCards`. In you source files import the component and then apply your theme:

1. Use CocoaPods to install `MDCCards`
    1. Add the following line to your `Podfile`:
	```pod
	pod 'MaterialComponents/Cards'
	```
    1. Run the installer:
	```bash
	pod install
	```
1. Import `MDCCards` and MDC card theming and initialize `MDCCards` using `alloc/init`. Initialize your theme before applying it to your button.

  **Note** For more information about themes, go to the Theming page for iOS.

<!--<div class="material-code-render" markdown="1">-->
  ```swift
  import MaterialComponents.MaterialCards
  ```

  ```objc
  #import "MaterialCards.h"
  ```
<!--</div>-->
1 Apply accessibility settings

    To help make your card as usable to as many users as possible, you need to set both `isAccessibilityElement` and set an appropriate [accessibilityLabel](https://developer.apple.com/documentation/uikit/uiaccessibilityelement/1619577-accessibilitylabel).

    * The following examples set accessibility labels for card collections:
<br>
<!--<div class="material-code-render" markdown="1">-->
        **Swift**
        ````
        card.isAccessibilityElement = true
        card.accessibilityLabel = "Location \(userLocation.name) is popular with users " +
          "who enjoy \(userLocation.popularActivityMatchingUserProfile(userProfile))"
        ```
        **Objective-C**
        ```objc
        card.isAccessibilityElement = YES;
          card.accessibilityLabel = [NSString 
            stringWithFormat:@"Location %@ is popular with users who enjoy %@",  
            userLocation.name, 
            userLocation.popularActivityMatchingUserProfile(userProfile)];
        ```
<!--</div>-->
    * The following examples set accessiblity labels for any card images:
<!--<div class="material-code-render" markdown="1">-->
          **Swift**
	  ```
	  articleImageView.isAccessibilityElement = true
	    articleImageView.accessibilityLabel = "Event or scene description"
	  ```
	  **Objective-C**
	  ```objc
	  articleImageView.isAccessibilityElement = YES;
	    articleImageView.accessibilityLabel = @"Event or scene description";
	  ```
<!--</div>-->
    * The following examples apply to images that have a rating value:
<!--<div class="material-code-render" markdown="1">-->
	  **Swift**
	 ```
	  ratingView.isAccessibilityElement = true
	    ratingView.accessibilityLabel = "Average customer rating, out of " + 
	      "\(MDCProductRating.maximumValue) stars"
	    ratingView.accessibilityValue = (String)product.averageRating
	  ```
	  ***Objective-C**
	  ```Objc
	  ratingView.isAccessibilityElement = YES;
	    ratingView.accessibilityLabel = [NSString stringWithFormat:@"Average customer" +
	      " rating, out of %d stars", MDCProductRating.maximumValue];
	    ratingView.accessibilityValue = @(product.averageRating).stringValue;
	  ```
<!--</div>-->

## Card
 
On mobile, an [elevated card’s](https://material.io/components/cards/#specs) default elevation is 1dp, with a raised dragged elevation of 8dp.

### Card example

Source code API:
* `MDCCard` 
  * [Class definition](https://material.io/components/ios/catalog/cards/api-docs/Classes/MDCCard.html)
  * [GitHub source](https://github.com/material-components/material-components-ios/blob/develop/components/Cards/src/MDCCard.h)


The following example shows an elevated card. The card has a title, a secondary title, text, and two actions: Action 1 and Action 2 in purple (#6200EE).

<img src="assets/<platform>-elevated-card.png" alt="elevated card example for <platform> showing ...">

```
<source code here>
The source code example should display as per the interactive example (https://material.io/components/cards/#) with supporting text and Buttons:
* Display two elevated cards, for each card
* Display a card title "Card title 1" for one card and "Card title 2" for the other
* Display a secondary title "Secondary text" with an opacity of 60%
* Display text reading "Greyhound divisively hello coldly wonderfully marginally far upon excluding." with an opacity of 60%
* Display two actions, "Action 1" and "Action 2" with two text buttons
* Display the sample images ![sample card image of yellow and red tulips](assets/card-sample-image.jpg) and ![sample card image of red and yellow apples ](assets/card-sample-image-2.jpg)
* Allow the cards to be moveable.
```

### Card example with icon buttons


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

The class `ToggleButtonCollectionViewController` &ndash; which extends `UICollectionViewController` &ndash; can then load the images and icons in a list, and `ToggleButtonCollectionViewController` can then be instantiated to display each image with an icon in an array.



### Key properties

![Card anatomy diagram.](assets/card-anatomy.png)

**1. Elevated card attributes**

1. **Container** 
2. **Thumbnail [optional]** 
3. **Header text [optional]** 
4. **Subhead [optional]**
5. **Media [optional]** 
6. **Supporting text [optional]** 
7. **Buttons [optional]**
8. **Icons [optional]** 

<b>Container</b>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Container width |  | | |
|Container heigh|  | | |
|Container margin (left) |  | | |
|Container margin (right)|  | | |
|Container margin (top)|  | | |
|Container minimum height|  | | |
|Container elevation | | | |

<b>Thumbnail (optional)</b>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |

<b>Header text (optional)</b>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |

<b>Subhead (optional)</b>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |

<b>Media (optional)</b>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |

<b>Supporting text (optional)</b>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |

<b>Button (optional)</b>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |

<b>Icon (optional)</b>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



## Theming Cards

Cards support [Material Theming](https://material.io/components/cards/#theming) and can be customized in terms of color, typography and shape.

`MDCCards` supports Material Theming using a container scheme. The following code samples show how to apply a theme to a card:

**Swift**
```swift
// Import the Cards Theming Extensions module
import MaterialComponents.MaterialCards_MaterialTheming
 ...
 // Create or use your app's Container Scheme
let containerScheme = MDCContainerScheme()
 // Theme the card with either default theme
card.applyTheme(withScheme: containerScheme)
 // Or outlined theme
card.applyOutlinedTheme(withScheme: containerScheme)
```

**Objective-C**
```objc
// Import the Cards Theming Extensions header
#import <MaterialComponents/MaterialCards+MaterialTheming.h>
 ...
 // Create or use your app's Container Scheme
MDCContainerScheme *containerScheme = [[MDCContainerScheme alloc] init];
 // Theme the card with either default theme
[self.card applyThemeWithScheme:containerScheme];
 // Or outlined theme
[self.card applyOutlinedThemeWithScheme:containerScheme];
```

### Card theming example

API and source code

* `\<card classes\>`
  * [Class definition](https://)
  * [GitHub source](https://github.com/material-components/)

_Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_
```
* Display an outlined card 
* Display a card title "Card title"
* Display a secondary title "Secondary text"
* Display text reading "Greyhound divisively hello coldly wonderfully marginally far upon excluding."
* Display two actions, "Action 1" and "Action 2" with two text buttons
* Display the sample image ![sample card image of yellow and red tulips](assets/card-sample-image.jpg)
* Make the card checkable with a "favorites" icon

```

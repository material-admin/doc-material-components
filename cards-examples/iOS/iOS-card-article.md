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

A card can be one of two types:
1. [Elevated](#elevated-card)
1. [Outlined](#outlined-card)

![Elevated and Outlined cards wtih a secondary title and two actions: Action 1 and Action 2 in purple](assets/cards-generic.png) 


## Using cards

### Install `MDCCards`

<details><summary>Expand for installation instructions for <code></code>MDCCards</summary>

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

  ```swift
  import MaterialComponents.MaterialCards
  ```

  ```objc
  #import "MaterialCards.h"
  ```
1 Apply accessibility settings

    To help make your card as usable to as many users as possible, you need to set both `isAccessibilityElement` and set an appropriate [accessibilityLabel](https://developer.apple.com/documentation/uikit/uiaccessibilityelement/1619577-accessibilitylabel).

    * The following examples set accessibility labels for card collections:
<br>
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
    * The following examples set accessiblity labels for any card images:
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
    * The following examples apply to images that have a rating value:
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
</details>

## Elevated card
 
On mobile, an [elevated card’s](https://material.io/components/cards/#specs) default elevation is 1dp, with a raised dragged elevation of 8dp.

### Elevated card example

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


### Key properties

![\<Placeholder diagram of elevated card attributes. Replace this text if/when there is an approved diagram\>](assets/card-anatomy.png)

**1. Elevated card attributes**

1. **Container** 
2. **Thumbnail [optional]** 
3. **Header text [optional]** 
4. **Subhead [optional]**
5. **Media [optional]** 
6. **Supporting text [optional]** 
7. **Buttons [optional]**
8. **Icons [optional]** 


<details>
<summary><b>Container</b> attributes</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Container width |  | | |
|Container heigh|  | | |
|Container margin (left) |  | | |
|Container margin (right)|  | | |
|Container margin (top)|  | | |
|Container minimum height|  | | |
|Container elevation | | | |


</details>

<details>
<summary><b>Thumbnail</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</details>

<details>
<summary><b>Header text</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |



</details>

<details>
<summary><b>Subhead</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |



</details>

<details>
<summary><b>Media</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |




</details>

<details>
<summary><b>Supporting text</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |




</details>

<details>
<summary><b>Button</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |




</details>

<details>
<summary><b>Icon</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |




</details>


## Outlined card
 
On desktop and mobile, [outlined cards](https://material.io/components/cards/#specs) can have a resting elevation of 0dp. They elevate to 4dp on hover.

### Outlined card example

Source code API:
* `MDCCard` 
  * [Class definition](https://material.io/components/ios/catalog/cards/api-docs/Classes/MDCCard.html)
  * [GitHub source](https://github.com/material-components/material-components-ios/blob/develop/components/Cards/src/MDCCard.h)


The following example shows an outlined card. The card has a title, a secondary title, text, and two actions: Action 1 and Action 2 in purple (#6200EE).


<img src="assets/<platform>-outlined-card.png" alt="outlined card example for <platform> showing ...">

```
<source code here>
The source code example should display as per the interactive example (https://material.io/components/cards/#) with supporting text and Buttons:
* Display an outlined card with an outline of 60% opacity
* Display a card title "Card title"
* Display a secondary title "Secondary text" with an opacity of 60%
* Display text reading "Greyhound divisively hello coldly wonderfully marginally far upon excluding." with an opacity of 60%
* Display two actions, "Action 1" and "Action 2" with two text buttons
* Display the sample image ![sample card image of yellow and red tulips](assets/card-sample-image.jpg)
* Make the card selectable with a "favorites" icon

```

### Key properties

![\<Placeholder diagram of outlined card  attributes. Replace this text if/when there is an approved diagram\>](assets/card-anatomy.png)

**1. Outlined card attributes**

1. **Container** 
2. **Thumbnail [optional]** 
3. **Header text [optional]** 
4. **Subhead [optional]** 
5. **Media [optional]** 
6. **Supporting text [optional]** 
7. **Buttons [optional]**
8. **Icons [optional]** 

<details>
<summary><b>Container</b> attributes</summary>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Container width |  | | |
|Container heigh|  | | |
|Container margin (left) |  | | |
|Container margin (right)|  | | |
|Container margin (top)|  | | |
|Container minimum height|  | | |
|Container elevation | | | |


</details>

<details>
<summary><b>Thumbnail</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |


</details>

<details>
<summary><b>Header text</b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |


</details>

<details>
<summary><b>Subhead</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |


</details>

<details>
<summary><b>Media</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</details>

<details>

<summary><b>Supporting text</b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |


</details>

<details>
<summary><b>Button</b> attributes (optional)</summary>



</details>

<details>
<summary><b>Icon</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</details>



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

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



# Card

A [card](https://material.io/components/cards/) contains content and actions about a single subject.

![Elevated card wtih a secondary title and two actions: Action 1 and Action 2 in purple](assets/generic-card-type-elevated.png) 


## Using a card

Before you can use a Material card, you need to add a dependency to the Material Components for Android library. For more information, go to the [Getting started](https://github.com/material-components/material-components-android/blob/master/docs/getting-started.md) page.

### Making a card accessible

Android's card component APIs support labeling for accessibility. To use labels...

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).

## Card
 
On mobile, a [card’s](https://material.io/components/cards/#specs) default elevation is 1dp, with a raised dragged elevation of 8dp.

### Card example

Source code API:
* \<platform component name\>
  * [Class definition](https://developer.android.com/reference/com/google/android/material/card/MaterialCardView)
  * [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/card/MaterialCardView.java)


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
* Display the sample images ![sample card image of yellow and red tulips](assets/card-sample-image.jpg) and ![sample card image of red and yellow apples](assets/card-sample-image-2.jpg)
* Allow the cards to be moveable.
```


### Key properties

![card anatomy diagram](assets/card-anatomy.png)

**1. Card attributes**

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
|Container width | `android:layout_width` | | |
|Container heigh| `android:layout_height` | | |
|Container margin (left) | `android:layout_marginLeft` | | |
|Container margin (right)| `android:layout_marginRight` | | |
|Container margin (top)| `android:layout_marginTop` | | |
|Container minimum height| `android:minHeight` | | |
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


## Theming a card

A card supports [Material Theming](https://material.io/components/cards/#theming) and can be customized in terms of color, typography and shape.

![Screenshot of card theming example](assets/<screenshot of theming example>.png)


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

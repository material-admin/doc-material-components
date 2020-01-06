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

Before you can use Material cards, you need to add a dependency to the Material Components for Android library. For more information, go to the [Getting started](https://github.com/material-components/material-components-android/blob/master/docs/getting-started.md) page.

### Making cards accessible

Android's card component APIs support labeling for accessibility. To use labels...

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).

## Elevated card
 
On mobile, an [elevated card’s](https://material.io/components/cards/#specs) default elevation is 1dp, with a raised dragged elevation of 8dp.

### Key properties

![\<Placeholder diagram of elevated card attributes. Replace this text if/when there is an approved diagram\>](assets/card-anatomy.png)

**1. Elevated card attributes**

1. **Container** <br>
Card containers hold all card elements, and their size is determined by the space those elements occupy. Card elevation is expressed by the container.

2. **Thumbnail [optional]** <br>
Cards can include thumbnails to display an avatar, logo, or icon.

3. **Header text [optional]** <br>
Header text can include things like the name of a photo album or article.

4. **Subhead [optional]** <br>
Subhead text can include text elements such as an article byline or a tagged location.

5. **Media [optional]** <br>
Cards can include a variety of media, including photos, and graphics, such as weather icons.

6. **Supporting text [optional]** <br>
Supporting text include text like an article summary or a restaurant description.

7. **Buttons [optional]** <br>
Cards can include buttons for actions.

8. **Icons [optional]** <br>
Cards can include icons for actions.



<details>
<summary><b>Container</b> attributes</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Container width | `android:layout_width` | | |
|Container heigh| `android:layout_height` | | |
|Container margin (left) | `android:layout_marginLeft` | | |
|Container margin (right)| `android:layout_marginRight` | | |
|Container margin (top)| `android:layout_marginTop` | | |
|Container minimum height| `android:minHeight` | | |


</p>
</details>

<details>
<summary><b>Thumbnail</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |


</p>
</details>

<details>
<summary><b>Header text</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |



</p>
</details>

<details>
<summary><b>Subhead</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |


</p>
</details>

<details>
<summary><b>Media</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</p>
</details>

<details>
<summary><b>Supporting text</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |



</p>
</details>

<details>
<summary><b>Button</b> attributes (optional)</summary>
<p>

Material button API and source code:
* [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
* [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)

</p>
</details>

<details>
<summary><b>Icon</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</p>
</details>

<details>
<summary><b>Behavior</b> (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Checkable card | `@style/Widget.MateiralComponents.CardView` | `setChecked(boolean)`| none |
| Draggable card | [`ViewDragHelper` class](https://developer.android.com/reference/android/support/v4/widget/ViewDragHelper) | | none | 

</p>
</details>


### Elevated card example

Source code API:
* \<platform component name\>
  * [Class definition](https://)
  * [GitHub source](https://github.com/material-components/)


The following example shows an elevated card. The card has a title, a secondary title, text, and two actions: Action 1 and Action 2 in purple (#6200EE).

<img src="assets/<platform>-elevated-card.png" alt="elevated card example for <platform> showing ...">

```
<source code here>
The source code example should display as per the interactive example (https://material.io/components/cards/#) with supporting text and Buttons, minus the media:
* Display two elevated cards, for each card
* Display a card title "Card title 1" for one card and "Card title 2" for the other
* Display a secondary title "Secondary text" with an opacity of 60%
* Display text reading "Greyhound divisively hello coldly wonderfully marginally far upon excluding." with an opacity of 60%
* Display two actions, "Action 1" and "Action 2" with two text buttons
* Display the sample images ![sample card image of yellow and red tulips](assets/card-sample-image.jpg) and ![sample card image of red and yellow apples in blue plastic crates at roadside street stand](assets/card-sample-image-2.jpg)
* Allow the cards to be moveable.
```


## Outlined card
 
On desktop and mobile, [outlined cards](https://material.io/components/cards/#specs) can have a resting elevation of 0dp. They elevate to 4dp on hover.
### Key properties

![\<Placeholder diagram of outlined card  attributes. Replace this text if/when there is an approved diagram\>](assets/card-anatomy.png)

**1. Outlined card attributes**

1. **Container** <br>
Card containers hold all card elements, and their size is determined by the space those elements occupy. Card elevation is expressed by the container.

2. **Thumbnail [optional]** <br>
Cards can include thumbnails to display an avatar, logo, or icon.

3. **Header text [optional]** <br>
Header text can include things like the name of a photo album or article.

4. **Subhead [optional]** <br>
Subhead text can include text elements such as an article byline or a tagged location.

5. **Media [optional]** <br>
Cards can include a variety of media, including photos, and graphics, such as weather icons.

6. **Supporting text [optional]** <br>
Supporting text include text like an article summary or a restaurant description.

7. **Buttons [optional]** <br>
Cards can include buttons for actions.

8. **Icons [optional]** <br>
Cards can include icons for actions.

<details>
<summary><b>Container</b> attributes</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |

</p>
</details>

<details>
<summary><b>Thumbnail</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |

</p>
</details>

<details>
<summary><b>Header text</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Text label | | | |
| Text color | | | |
| Typography | | | |



</p>
</details>

<details>
<summary><b>Subhead</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |


</p>
</details>

<details>
<summary><b>Media</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |


</p>
</details>

<details>

<summary><b>Supporting text</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |


</p>
</details>

<details>
<summary><b>Button</b> attributes (optional)</summary>
<p>

Material button API and source code:
* [Class description](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
* [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/button/MaterialButton.java)

</p>
</details>

<details>
<summary><b>Icon</b> attributes (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |


</p>
</details>

<details>
<summary><b>Behavior</b> (optional)</summary>
<p>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
| Checkable card | `@style/Widget.MateiralComponents.CardView` | `setChecked(boolean)`| none |
| Draggable card | [`ViewDragHelper` class](https://developer.android.com/reference/android/support/v4/widget/ViewDragHelper) | | none, not recommended` | 



</p>
</details>


### Outlined card example

Source code API:
* \<platform component name\>
  * [Class definition](https://)
  * [GitHub source](https://github.com/material-components/)


The following example shows an outlined card. The card has a title, a secondary title, text, and two actions: Action 1 and Action 2 in purple (#6200EE).


<img src="assets/<platform>-outlined-card.png" alt="outlined card example for <platform> showing ...">

```
<source code here>
The source code example should display as per the interactive example (https://material.io/components/cards/#) with supporting text and Buttons, minus the media:
* Display an outlined card with an outline of 60% opacity
* Display a card title "Card title"
* Display a secondary title "Secondary text" with an opacity of 60%
* Display text reading "Greyhound divisively hello coldly wonderfully marginally far upon excluding." with an opacity of 60%
* Display two actions, "Action 1" and "Action 2" with two text buttons
* Display the sample image ![sample card image of yellow and red tulips](assets/card-sample-image.jpg)
* Make the card selectable with a "favorites" icon

```

## Theming Cards

Cards support [Material Theming](https://material.io/components/cards/#theming) and can be customized in terms of color, typography and shape.

### Card theming example

API and source code

* `\<card classes\>`
  * [Class definition](https://)
  * [GitHub source](https://github.com/material-components/)


<!--docs:
title: "Top app bar"
layout: detail
section: components
excerpt: "Android top app bar"
latest_update: "2020-02-xx"
iconId:
path: /
api_doc_root:
-->

# Top app bar

The [top app bar](https://material.io/components/app-bars-top/#) displays information and actions relating to the current screen.

There are two types of top app bar:

1. [Regular top app bar](#regular-top-app-bar)
1. [Contextual action bar](#contextual-top-app-bar)
<br>


1. ![Regular app bar: purple background, white text and icons](assets/regular_app_bar_example.png)
1. ![Contextual app bar: black background, white text and icons](assets/contextual_app_bar_example.png)

## Using the top app bar

The top app bar provides content and actions related to the current screen. It’s used for branding, screen titles, navigation, and actions.

A regular top app bar can transform into a contextual action bar.

Before you can use Material buttons, you need to add a dependency to the Material Components for Android library. For more information, go to the [Getting started](https://github.com/material-components/material-components-android/blob/master/docs/getting-started.md) page.


### Making the top app bar accessible

_List any accessiblity setting or attributes (such as labels), describe how to use them and link to any guidelines on the m.io site (for example, [how to write a good accessibility label for your component](https://material.io/design/usability/accessibility.html#writing))_



## Regular top app bar

The top app bar provides content and actions related to the current screen. It’s used for branding, screen titles, navigation, and actions.

### Regular top app bar example

`AppBarLayout`
* [Class definition](https://developer.android.com/reference/com/google/android/material/appbar/AppBarLayout)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/AppBarLayout.java)

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

<!--docs:
title: "Bottom navigation"
layout: detail
section: components
excerpt: "Bottom navation bars allow movement between primary distinations in an app"
iconId:
path: /components/bottom-navigation
-->


# Bottom navigation

[Bottom navigation](https://material.io/components/bottom-navigation/#) bars allow movement between primary destinations in an app.

![Example bottom navigation bar with four icons along the bottom: favorites, music, places, and news. The music icon is selected](assets/bottom-nav-generic.png)


## Using bottom navigation

Bottom navigation bars display three to five destinations at the bottom of a screen. Each destination is represented by an icon and an optional text label. When a bottom navigation icon is tapped, the user is taken to the top-level navigation destination associated with that icon.

Do the following to implement a bottom navigation bar for Android:

1.  Create a
    [menu resource](https://developer.android.com/guide/topics/resources/menu-resource.html)
    with up to 5 navigation targets (`BottomNavigationView` does not support
    more than 5 items)
2.  Lay out your `BottomNavigationView` below your content
3.  Set the `app:menu` attribute on your `BottomNavigationView` to your menu
    resource
4.  Listen for selection events using
    `setOnNavigationItemSelectedListener(...)`

A typical XML layout file would look something like this:

```xml
<FrameLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

  <!-- Main content -->

  <com.google.android.material.bottomnavigation.BottomNavigationView
      android:id="@+id/bottom_navigation"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_gravity="bottom"
      android:background="@color/colorPrimary"
      app:itemIconTint="@color/white"
      app:itemTextColor="@color/white"
      app:menu="@menu/bottom_navigation_menu" />

</FrameLayout>
```

### Badges

![3 bottom navigation icons with badges numbering 0, 99, and 999+](assets/bottom-navigation-badges.png)

`BottomNavigationView` supports displaying icon and number badges.

Initializes and shows a BadgeDrawable associated with` menuItemId`. Subsequent
calls to this method will reuse the existing `BadgeDrawable`.

```java
BadgeDrawable badge = bottomNavigationView.getOrCreateBadge(menuItemId);
badge.setVisible(true);
```
NOTE: Don't forget to remove any BadgeDrawables that are no longer needed.

```java
bottomNavigationView.removeBadge(menuItemId);
```

#### Best Practice

If you only need to temporarily hide the badge (for example, until the next
notification is received), we recommended changing
the visibility of the `BadgeDrawable`.

Please see [`BadgeDrawable`](BadgeDrawable.md) for details on how to update the
badge content being displayed.

### Handling States

The `app:itemIconTint` and `app:itemTextColor` take a
[ColorStateList](https://developer.android.com/reference/android/content/res/ColorStateList.html)
instead of a simple color. This means that you can write a `selector` for these
colors that responds to the items' state changes.

For example, you could have a `bottom_navigation_colors.xml` `ColorStateList`
that contains:

```xml
<selector xmlns:android="http://schemas.android.com/apk/res/android">
  <item
      android:state_checked="true"
      android:color="@color/colorPrimary" />
  <item
      android:state_checked="false"
      android:color="@color/colorOnSurface" />
 </selector>
```

And you would use it like this on your `BottomNavigationView`:

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
    android:id="@+id/bottom_navigation"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    style="@style/Widget.MaterialComponents.BottomNavigationView"
    app:menu="@menu/bottom_navigation_menu" />
```

### Material Styles

Using `BottomNavigationView` with an updated Material theme
(`Theme.MaterialComponents`) will provide the correct updated Material styles to
your `BottomNavigationView`s by default. If you need to use an updated
`BottomNavigationView` and your application theme does not inherit from an
updated Material theme, or if you'd like to use a variant style, you can apply
one of the updated Material styles directly to your widget in XML:

#### Updated Material Style (Default)

The default Material `BottomNavigationView` style consists of updated colors,
text sizing, and behavior. The default BottomNavigationView has white background
and icons and text colored with `colorPrimary`.

```
style="@style/Widget.MaterialComponents.BottomNavigationView"
```

#### Colored Material Style

This style inherits from the default style but sets the colors to different
mappings. Use the colored style to get a bottom navigation bar with a
`colorPrimary` background and shades of white for the icon and text colors.

```
style="@style/Widget.MaterialComponents.BottomNavigationView.Colored"
```

#### Legacy Style

You can set this style on your `BottomNavigationView` if you'd like a bottom
navigation bar with the old behavior. However, we recommend you use the updated
Material style where possible.

```
style="@style/Widget.Design.BottomNavigationView"
```

### Making bottom navigation accessible

_**NOTE to developers: Are there any accessibility settings aside from the icon labels?**_


## Bottom navigation example

Source code API:

* `BottonNavigationView`
    * [Class description](https://developer.android.com/reference/com/google/android/material/bottomnavigation/BottomNavigationView)
    * [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/BottomNavigationView.java)


The following example shows a bottom navigation bar with four icons:

* favorites
* music note
* places
* news

<img src="assets/<platform>-bottom-nav.png" alt="bottom navigation bar with favorites, music note, places, and news icons">

```
<code snippet here>
The source code should render the following:
* bottom navigation bar with purple fill (#6200EE)
* four icons:
    * favorites
    * music note
    * places (not part of material.io icons)
    * news (not part of material.io icons)
* active icon should show up as white
* inactive icons should be show a 60% opacity
```

### Anatomy and key properties

The following is an anatomy diagram for the bottom navigation bar:

![bottom nav anatomy diagram](bottom-nav-anatomy.png)

1. Container
1. Inactive icon
1. Inactive text label
1. Active icon
1. Active text label

**Container attributes**
| &nbsp; | **Attribute** | **Related methods**  | **Default value** |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |


**Inactive icon attributes**
| &nbsp; | **Attribute** | **Related methods**  | **Default value** |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Typography** | | | |


**Inactive text label attributes**
| &nbsp; | **Attribute** | **Related methods**  | **Default value** |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** | | | |
| **Typography** | | | |


**Active icon attributes**
| &nbsp; | **Attribute** | **Related methods**  | **Default value** |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Typography** | | | |


**Active text label attributes**
| &nbsp; | **Attribute** | **Related methods**  | **Default value** |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** | | | |
| **Typography** | | | |


**Styles**

| &nbsp; | **Style** |
| --- | --- |
| **Default style** | |
| **Icon style** | |


## Theming a bottom nav bar

_Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_

```
<code snippet here>
The source code should render the following:
* bottom navigation bar
* four icons:
    * favorites
    * music note
    * places (not part of material.io icons)
    * news (not part of material.io icons)
```


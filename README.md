# ESPARTA_Team_S0305

## ESPARTA - Android-based Art Gallery System

### Finalized Project Proposal

The ESPARTA app is an Android-based art gallery system that allows users and artists to interact with artworks, with artists able to upload their works and users able to purchase them.

### Key Features:
- **Register/Login Functionality**: Artists and users can create accounts using Firebase Authentication.
- **MainActivity**: Displays a list of available artworks in a RecyclerView.
- **ArtistUploadActivity**: Allows artists to upload artwork with details like title, description, and image.
- **ArtworkDetailActivity**: Shows detailed information about a selected artwork (e.g., artist name, price, and description).
- **CartActivity**: Enables users to manage their shopping cart, adding or removing items.
- **PurchaseActivity**: Handles the checkout process for users purchasing artwork.

# ESPARTA Project

## Overview
ESPARTA is an Android app designed for an art gallery system, allowing users and artists to interact with artworks. The app includes features for user authentication, artwork uploads, and purchases.

## 2. Identify Any Risky Components

### Outside API Usage
- **Firebase Authentication**: 
  - Used for user and artist registration and login.
  - Risks include misconfiguration leading to unauthorized access and data breaches.
  
- **Firebase Firestore/Realtime Database**:
  - Utilized for storing user data, artwork, and purchase records.
  - Risks include potential data loss or inconsistency if not correctly managed.

### Functionality We Will Not Cover in Class
- **File Upload**: 
  - Uploading artwork images will be managed through **Firebase Storage**.
  - Proper permissions must be set for reading and writing files to ensure security.
  
- **Payment Integration**: 
  - Implementing a payment system may involve third-party services like **Stripe** or **PayPal**.
  - These integrations require careful handling of sensitive financial data and user information.

### Functionality to Be Covered Later
- **Database Services**:
  - Storing user data, artwork, and purchases in **Firebase Firestore** or **Realtime Database**.
  - Proper database structure and security rules will be implemented to protect user information.

- **Media Management**:
  - Artists can upload images, which necessitates media management for display and storage.
  - Handling image compression, formats, and retrieval for efficient loading and display.
 
    ## 3. Create an Online Repository (Bitbucket, GitHub, etc.)

A GitHub repository has been set up for version control and collaboration. All team members will push their contributions through branches, following GitHub workflow practices (commits, branches, and pull requests).

The repository is accessible by the team and your instructor, Dr. Hoot (Charles-Hoot). The GitHub workflow guidelines are followed, ensuring proper collaboration and version control.


## 4. Create All Layouts for the Application
 
The layouts for the ESPARTA app have been created, though the features are not fully functional yet. The layouts include the following:
 
- **RegisterActivity Layout**:  
  A simple registration form with fields for email and password, along with a button for user registration.
 
- **LoginActivity Layout**:  
  A login form for users and artists with input fields for credentials.
 
- **MainActivity Layout**:  
  Displays a list of available artworks using a RecyclerView. Buttons for navigation to upload artwork (for artists) or view artwork details (for users).
 
- **ArtistUploadActivity Layout**:  
  A form for artists to upload artwork, including fields for title, description, and an image upload button.
 
- **ArtworkDetailActivity Layout**:  
  Displays detailed information about a specific artwork (artist name, price, description, and image).
 
- **CartActivity Layout**:  
  Allows users to manage items in their cart (add/remove artwork).
 
- **PurchaseActivity Layout**:  
  Facilitates the purchase process with a final review of the shopping cart and a button to complete the purchase.

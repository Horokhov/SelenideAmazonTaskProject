package com.demo.actions;

public class Actions {
    private static MainActions mainActions;
    private static RegistrationActions registrationActions;
    private static LoginActions loginActions;
    private static CreateRegisterActions createRegisterActions;
    private static AssetActions assetActions;
    private static EmailActions emailActions;

    public static MainActions mainActions() {
        if (mainActions == null) {
            mainActions = new MainActions();
        }
        return mainActions;
    }

    public static RegistrationActions registrationActions() {
        if (registrationActions == null) {
            registrationActions = new RegistrationActions();
        }
        return registrationActions;
    }

    public static LoginActions loginActions() {
        if (loginActions == null) {
            loginActions = new LoginActions();
        }
        return loginActions;
    }

    public static CreateRegisterActions createRegisterActions() {
        if (createRegisterActions == null) {
            createRegisterActions = new CreateRegisterActions();
        }
        return createRegisterActions;
    }

    public static AssetActions assetActions() {
        if (assetActions == null) {
            assetActions = new AssetActions();
        }
        return assetActions;
    }

    public static EmailActions emailActions() {
        if (emailActions == null) {
            emailActions = new EmailActions();
        }
        return emailActions;
    }

}

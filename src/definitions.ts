export interface GooglePlayServicesCheckerPlugin {
  /***
   * Check if Google Play Services is available on the device
   */
  isGooglePlayServicesAvailable(): Promise<{ available: boolean }>;
}

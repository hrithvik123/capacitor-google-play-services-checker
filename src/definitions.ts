export interface GooglePlayServicesCheckerPlugin {
  isGooglePlayServicesAvailable(): Promise<{ available: boolean }>;
}

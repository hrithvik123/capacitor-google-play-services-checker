export interface GooglePlayServicesCheckerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}

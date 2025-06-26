## GitHub Copilot Chat

- Extension Version: 0.28.2 (prod)
- VS Code: vscode/1.101.1
- OS: Windows

## Network

User Settings:
```json
  "github.copilot.advanced.debug.useElectronFetcher": true,
  "github.copilot.advanced.debug.useNodeFetcher": false,
  "github.copilot.advanced.debug.useNodeFetchFetcher": true
```

Connecting to https://api.github.com:
- DNS ipv4 Lookup: 20.207.73.85 (21 ms)
- DNS ipv6 Lookup: Error (50 ms): getaddrinfo ENOTFOUND api.github.com
- Proxy URL: None (34 ms)
- Electron fetch (configured): HTTP 200 (286 ms)
- Node.js https: HTTP 200 (399 ms)
- Node.js fetch: HTTP 200 (288 ms)
- Helix fetch: HTTP 200 (408 ms)

Connecting to https://api.individual.githubcopilot.com/_ping:
- DNS ipv4 Lookup: 140.82.113.22 (11 ms)
- DNS ipv6 Lookup: Error (8 ms): getaddrinfo ENOTFOUND api.individual.githubcopilot.com
- Proxy URL: None (4 ms)
- Electron fetch (configured): HTTP 200 (895 ms)
- Node.js https: HTTP 200 (981 ms)
- Node.js fetch: HTTP 200 (903 ms)
- Helix fetch: HTTP 200 (999 ms)

## Documentation

In corporate networks: [Troubleshooting firewall settings for GitHub Copilot](https://docs.github.com/en/copilot/troubleshooting-github-copilot/troubleshooting-firewall-settings-for-github-copilot).
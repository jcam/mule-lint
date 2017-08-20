package org.nuisto

import groovy.util.logging.Slf4j

@Slf4j(category = 'org.nuisto.msa')
abstract class LoaderBaseScriptClass extends Script {
  ElementRule element(String name) {
    return this.binding.elementRule.element(name)
  }

  ElementRule version(String version) {
    this.binding.elementRule.version(version)

    log.info "Version set to {}", version

    this.binding.elementRule = new ElementRule()

    return this.binding.elementRule
  }
}



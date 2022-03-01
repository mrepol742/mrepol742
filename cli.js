import minimist from 'minimist'
import pkg from '.'

const options = {
  alias: { json: 'j' }
}
const argv = minimist(process.argv.slice(2), options)

console.log(pkg(argv))

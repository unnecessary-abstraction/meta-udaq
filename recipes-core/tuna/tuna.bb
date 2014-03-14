SUMMARY = "TUNA: Toolkit for Underwater Noise Analysis"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=65dd37ccb3e888dc57e47d925b80b38a"

DEPENDS = "alsa-lib libsndfile1 fftwf"

# We're building input_ads1672 which is specific to the UDAQ platform
DEPENDS += "ads1672"
PACKAGE_ARCH = "${MACHINE_ARCH}"

# We don't want to pass -e to make as it will clobber the variables setup by
# configure
EXTRA_OEMAKE = ""

SRC_URI = "git://bitbucket.org/underwater-acoustics/tuna.git;protocol=https"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
PV = "git${SRCPV}"

MIRRORS = ""
PREMIRRORS = ""

do_configure () {
	${S}/configure --prefix=/usr --enable-ads1672 --disable-docs \
		--disable-python-bindings --disable-unit-tests \
		--disable-plots --disable-integration-tests VERBOSITY=1
}

do_install () {
	oe_runmake install DESTDIR=${D}
}

global debug_package %{nil}

Name:           helloworld
Version:        1.0.0
Release:        0
Summary:        helloworld


Group:          ZhuBaJie/App
License:        GPL
#URL:            
Source:         %{name}-%{version}.tar.gz


#BuildRequires:  
#Requires:       

%define install_dir /data/work/www/java/dubbo-container
%define deploy_dir $RPM_BUILD_ROOT/%{install_dir}/deploy
%define config_dir $RPM_BUILD_ROOT/%{install_dir}/conf

%description




%prep
%setup -q


%build


%install
mkdir -p %{deploy_dir}
cp -r $RPM_BUILD_DIR/%{name}-%{version}/* %{deploy_dir}



%clean

%pre
echo "pre"

%post
echo "post"

%files
%defattr(-,root,root,-)
%doc
%{install_dir}


%changelog
